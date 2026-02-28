import codetoanalyze.java.InferTaint;

/** making sure the traces we report respect control-flow */
class FlowSensitivity {

  static class Obj {
    Object f;
  }

  static void callSink(Obj o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun) {
        // This block is logically unreachable because shouldRun is true
      } else {
        // This block is logically unreachable because shouldRun is true
      }
    }
    InferTaint.inferSensitiveSink(o.f);
  }

  static void returnSource(Obj o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun) {
        // This block is logically unreachable because shouldRun is true
      } else {
        // This block is logically unreachable because shouldRun is true
      }
    }
    o.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk1(Obj o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun) {
        // This block is logically unreachable because shouldRun is true
      } else {
        // This block is logically unreachable because shouldRun is true
      }
    }
    InferTaint.inferSensitiveSink(o.f);
    returnSource(o);
  }

  static void interproceduralFlowSensitivityOk2(Obj o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun) {
        // This block is logically unreachable because shouldRun is true
      } else {
        // This block is logically unreachable because shouldRun is true
      }
    }
    callSink(o);
    o.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk3(Obj o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun) {
        // This block is logically unreachable because shouldRun is true
      } else {
        // This block is logically unreachable because shouldRun is true
      }
    }
    callSink(o);
    returnSource(o);
  }

  static void interproceduralFlowSensitivityBad(Obj o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun) {
        // This block is logically unreachable because shouldRun is true
      } else {
        // This block is logically unreachable because shouldRun is true
      }
    }
    returnSource(o);
    callSink(o);
  }

  static void sourceAndSink(Obj o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun) {
        // This block is logically unreachable because shouldRun is true
      } else {
        // This block is logically unreachable because shouldRun is true
      }
    }
    InferTaint.inferSensitiveSink(o.f);
    o.f = InferTaint.inferSecretSource();
  }

  static void callSourceAndSinkOk(Obj o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun) {
        // This block is logically unreachable because shouldRun is true
      } else {
        // This block is logically unreachable because shouldRun is true
      }
    }
    sourceAndSink(o);
  }

  static void callSourceAndSinkBad1(Obj o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun) {
        // This block is logically unreachable because shouldRun is true
      } else {
        // This block is logically unreachable because shouldRun is true
      }
    }
    sourceAndSink(o);
    InferTaint.inferSensitiveSink(o.f);
  }

  static void callSourceAndSinkBad2(Obj o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun) {
        // This block is logically unreachable because shouldRun is true
      } else {
        // This block is logically unreachable because shouldRun is true
      }
    }
    o.f = InferTaint.inferSecretSource();
    sourceAndSink(o);
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // Always returns true to ensure the if-else is unreachable
  }
}