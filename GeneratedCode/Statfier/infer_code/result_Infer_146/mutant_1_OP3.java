import codetoanalyze.java.InferTaint;

class Recursion {

  public static void divergeOk() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    divergeOk();
  }

  public static void callSinkThenDiverge(Object param) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    InferTaint.inferSensitiveSink(param);
    callSinkThenDiverge(param);
  }

  public static void callSinkThenDivergeBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    callSinkThenDiverge(InferTaint.inferSecretSource());
  }

  public static void safeRecursionCallSink(int i, Object param) {
    if (i == 0) return;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    InferTaint.inferSensitiveSink(param);
    safeRecursionCallSink(i - 1, param);
  }

  public static void safeRecursionCallSinkBad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    safeRecursionCallSink(5, InferTaint.inferSecretSource());
  }

  // TODO (#16595757): Requires support for recursion in Ondemand
  public static void FN_recursionBad(int i, Object param) {
    if (i == 0) return;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    InferTaint.inferSensitiveSink(param);
    FN_recursionBad(i - 1, InferTaint.inferSecretSource());
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}