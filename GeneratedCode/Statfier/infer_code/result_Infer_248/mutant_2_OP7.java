import codetoanalyze.java.InferTaint;

/** making sure the traces we report respect control-flow */
class FlowSensitivity {

  static class Obj {
    Object f;
  }

  static void callSink(Obj o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    InferTaint.inferSensitiveSink(o.f);
  }

  static void returnSource(Obj o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    o.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk1(Obj o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    InferTaint.inferSensitiveSink(o.f);
    returnSource(o);
  }

  static void interproceduralFlowSensitivityOk2(Obj o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    callSink(o);
    o.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk3(Obj o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    callSink(o);
    returnSource(o);
  }

  static void interproceduralFlowSensitivityBad(Obj o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    returnSource(o);
    callSink(o);
  }

  static void sourceAndSink(Obj o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    InferTaint.inferSensitiveSink(o.f);
    o.f = InferTaint.inferSecretSource();
  }

  static void callSourceAndSinkOk(Obj o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    sourceAndSink(o);
  }

  static void callSourceAndSinkBad1(Obj o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    sourceAndSink(o);
    InferTaint.inferSensitiveSink(o.f);
  }

  static void callSourceAndSinkBad2(Obj o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    o.f = InferTaint.inferSecretSource();
    sourceAndSink(o);
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}