import codetoanalyze.java.InferTaint;

/** making sure the traces we report respect control-flow */
class FlowSensitivity {

  static class Obj {
    Object f;
  }

  static void callSink(Obj o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    InferTaint.inferSensitiveSink(o.f);
  }

  static void returnSource(Obj o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    o.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk1(Obj o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    InferTaint.inferSensitiveSink(o.f);
    returnSource(o);
  }

  static void interproceduralFlowSensitivityOk2(Obj o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    callSink(o);
    o.f = InferTaint.inferSecretSource();
  }

  static void interproceduralFlowSensitivityOk3(Obj o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    callSink(o);
    returnSource(o);
  }

  static void interproceduralFlowSensitivityBad(Obj o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    returnSource(o);
    callSink(o);
  }

  static void sourceAndSink(Obj o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    InferTaint.inferSensitiveSink(o.f);
    o.f = InferTaint.inferSecretSource();
  }

  static void callSourceAndSinkOk(Obj o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    sourceAndSink(o);
  }

  static void callSourceAndSinkBad1(Obj o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    sourceAndSink(o);
    InferTaint.inferSensitiveSink(o.f);
  }

  static void callSourceAndSinkBad2(Obj o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        System.out.println("This is an unreachable if statement.");
      } else {
        System.out.println("This is an unreachable else statement.");
      }
    }
    o.f = InferTaint.inferSecretSource();
    sourceAndSink(o);
  }

  private static boolean getCondition() {
    return true; // This can be any dynamic condition
  }

  private static boolean getUnreachableCondition() {
    return false; // This condition is meant to be false at runtime
  }
}