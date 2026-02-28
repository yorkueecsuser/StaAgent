import codetoanalyze.java.InferTaint;

class Recursion {

  public static void divergeOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    divergeOk();
  }

  public static void callSinkThenDiverge(Object param) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    InferTaint.inferSensitiveSink(param);
    callSinkThenDiverge(param);
  }

  public static void callSinkThenDivergeBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    callSinkThenDiverge(InferTaint.inferSecretSource());
  }

  public static void safeRecursionCallSink(int i, Object param) {
    if (i == 0) return;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    InferTaint.inferSensitiveSink(param);
    safeRecursionCallSink(i - 1, param);
  }

  public static void safeRecursionCallSinkBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    safeRecursionCallSink(5, InferTaint.inferSecretSource());
  }

  // TODO (#16595757): Requires support for recursion in Ondemand
  public static void FN_recursionBad(int i, Object param) {
    if (i == 0) return;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    InferTaint.inferSensitiveSink(param);
    FN_recursionBad(i - 1, InferTaint.inferSecretSource());
  }

  private static boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}