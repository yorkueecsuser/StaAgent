import codetoanalyze.java.InferTaint;

/** making sure the traces we report respect control-flow */
class FlowSensitivity {

  static class Obj {
    Object f;
  }

  static void callSink(Obj o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false at runtime
    }
    InferTaint.inferSensitiveSink(o.f);
  }

  static void returnSource(Obj o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false at runtime
    }
    o.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk1(Obj o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false at runtime
    }
    InferTaint.inferSensitiveSink(o.f);
    returnSource(o);
  }

  static void interproceduralFlowSensitivityOk2(Obj o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false at runtime
    }
    callSink(o);
    o.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk3(Obj o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false at runtime
    }
    callSink(o);
    returnSource(o);
  }

  static void interproceduralFlowSensitivityBad(Obj o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false at runtime
    }
    returnSource(o);
    callSink(o);
  }

  static void sourceAndSink(Obj o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false at runtime
    }
    InferTaint.inferSensitiveSink(o.f);
    o.f = InferTaint.inferSecretSource();
  }

  static void callSourceAndSinkOk(Obj o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false at runtime
    }
    sourceAndSink(o);
  }

  static void callSourceAndSinkBad1(Obj o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false at runtime
    }
    sourceAndSink(o);
    InferTaint.inferSensitiveSink(o.f);
  }

  static void callSourceAndSinkBad2(Obj o) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor will always be false at runtime
    }
    o.f = InferTaint.inferSecretSource();
    sourceAndSink(o);
  }

  static boolean getCondition() {
    return false; // This method ensures that the condition is always false at runtime
  }
}