import codetoanalyze.java.InferTaint;

/** making sure the traces we report respect control-flow */
class FlowSensitivity {

  static class Obj {
    Object f;
  }

  static void callSink(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static void returnSource(Obj o) {
    o.f = InferTaint.inferSecretSource();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static void interproceduralFlowSensitivityOk1(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    returnSource(o);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static void interproceduralFlowSensitivityOk2(Obj o) {
    callSink(o);
    o.f = InferTaint.inferSecretSource();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static void interproceduralFlowSensitivityOk3(Obj o) {
    callSink(o);
    returnSource(o);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static void interproceduralFlowSensitivityBad(Obj o) {
    returnSource(o);
    callSink(o);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static void sourceAndSink(Obj o) {
    InferTaint.inferSensitiveSink(o.f);
    o.f = InferTaint.inferSecretSource();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static void callSourceAndSinkOk(Obj o) {
    sourceAndSink(o);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static void callSourceAndSinkBad1(Obj o) {
    sourceAndSink(o);
    InferTaint.inferSensitiveSink(o.f);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  static void callSourceAndSinkBad2(Obj o) {
    o.f = InferTaint.inferSecretSource();
    sourceAndSink(o);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable loop */ }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}