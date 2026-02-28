import codetoanalyze.java.InferTaint;

class Recursion {

  public static void divergeOk() {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because condition is not set to true
        System.out.println("Unreachable code");
        break;
    }
    divergeOk();
  }

  public static void callSinkThenDiverge(Object param) {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because condition is not set to true
        System.out.println("Unreachable code");
        break;
    }
    InferTaint.inferSensitiveSink(param);
    callSinkThenDiverge(param);
  }

  public static void callSinkThenDivergeBad() {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because condition is not set to true
        System.out.println("Unreachable code");
        break;
    }
    callSinkThenDiverge(InferTaint.inferSecretSource());
  }

  public static void safeRecursionCallSink(int i, Object param) {
    if (i == 0) return;
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because condition is not set to true
        System.out.println("Unreachable code");
        break;
    }
    InferTaint.inferSensitiveSink(param);
    safeRecursionCallSink(i - 1, param);
  }

  public static void safeRecursionCallSinkBad() {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because condition is not set to true
        System.out.println("Unreachable code");
        break;
    }
    safeRecursionCallSink(5, InferTaint.inferSecretSource());
  }

  // TODO (#16595757): Requires support for recursion in Ondemand
  public static void FN_recursionBad(int i, Object param) {
    if (i == 0) return;
    boolean condition = getCondition();
    switch(condition) {
      case true: // This will never be reached because condition is not set to true
        System.out.println("Unreachable code");
        break;
    }
    InferTaint.inferSensitiveSink(param);
    FN_recursionBad(i - 1, InferTaint.inferSecretSource());
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the switch statement unreachable
  }
}