import codetoanalyze.java.InferTaint;

class Recursion {

  public static void divergeOk() {
    divergeOk();
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
    } else {
      // This block is unreachable because condition is never set to true
    }
  }

  public static void callSinkThenDiverge(Object param) {
    InferTaint.inferSensitiveSink(param);
    callSinkThenDiverge(param);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
    } else {
      // This block is unreachable because condition is never set to true
    }
  }

  public static void callSinkThenDivergeBad() {
    callSinkThenDiverge(InferTaint.inferSecretSource());
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
    } else {
      // This block is unreachable because condition is never set to true
    }
  }

  public static void safeRecursionCallSink(int i, Object param) {
    if (i == 0) return;
    InferTaint.inferSensitiveSink(param);
    safeRecursionCallSink(i - 1, param);
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
    } else {
      // This block is unreachable because condition is never set to true
    }
  }

  public static void safeRecursionCallSinkBad() {
    safeRecursionCallSink(5, InferTaint.inferSecretSource());
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
    } else {
      // This block is unreachable because condition is never set to true
    }
  }

  // TODO (#16595757): Requires support for recursion in Ondemand
  public static void FN_recursionBad(int i, Object param) {
    if (i == 0) return;
    InferTaint.inferSensitiveSink(param);
    FN_recursionBad(i - 1, InferTaint.inferSecretSource());
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
    } else {
      // This block is unreachable because condition is never set to true
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}