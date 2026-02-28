import codetoanalyze.java.InferTaint;

class Recursion {

  public static void divergeOk() {
    divergeOk();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("Unreachable code");
        break;
    }
  }

  public static void callSinkThenDiverge(Object param) {
    InferTaint.inferSensitiveSink(param);
    callSinkThenDiverge(param);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("Unreachable code");
        break;
    }
  }

  public static void callSinkThenDivergeBad() {
    callSinkThenDiverge(InferTaint.inferSecretSource());
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("Unreachable code");
        break;
    }
  }

  public static void safeRecursionCallSink(int i, Object param) {
    if (i == 0) return;
    InferTaint.inferSensitiveSink(param);
    safeRecursionCallSink(i - 1, param);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("Unreachable code");
        break;
    }
  }

  public static void safeRecursionCallSinkBad() {
    safeRecursionCallSink(5, InferTaint.inferSecretSource());
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("Unreachable code");
        break;
    }
  }

  // TODO (#16595757): Requires support for recursion in Ondemand
  public static void FN_recursionBad(int i, Object param) {
    if (i == 0) return;
    InferTaint.inferSensitiveSink(param);
    FN_recursionBad(i - 1, InferTaint.inferSecretSource());
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() never returns true
        System.out.println("Unreachable code");
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}