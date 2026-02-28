import codetoanalyze.java.InferTaint;

class Recursion {

  public static void divergeOk() {
    divergeOk();
  }

  public static void callSinkThenDiverge(Object param) {
    InferTaint.inferSensitiveSink(param);
    callSinkThenDiverge(param);
  }

  public static void callSinkThenDivergeBad() {
    callSinkThenDiverge(InferTaint.inferSecretSource());
  }

  public static void safeRecursionCallSink(int i, Object param) {
    if (i == 0) return;
    InferTaint.inferSensitiveSink(param);
    safeRecursionCallSink(i - 1, param);
  }

  public static void safeRecursionCallSinkBad() {
    safeRecursionCallSink(5, InferTaint.inferSecretSource());
  }

  // TODO (#16595757): Requires support for recursion in Ondemand
  public static void FN_recursionBad(int i, Object param) {
    if (i == 0) return;
    InferTaint.inferSensitiveSink(param);
    FN_recursionBad(i - 1, InferTaint.inferSecretSource());
  }

  // Mutated code
  public static void divergeOkx() {
    divergeOkx();
  }

  public static void callSinkThenDivergex(Object b) {
    InferTaint.inferSensitiveSink(b);
    callSinkThenDivergex(b);
  }

  public static void callSinkThenDivergeBadx() {
    callSinkThenDivergex(InferTaint.inferSecretSource());
  }

  public static void safeRecursionCallSinkx(int j, Object c) {
    if (j == 0) return;
    InferTaint.inferSensitiveSink(c);
    safeRecursionCallSinkx(j - 1, c);
  }

  public static void safeRecursionCallSinkBadx() {
    safeRecursionCallSinkx(5, InferTaint.inferSecretSource());
  }

  // TODO (#16595757): Requires support for recursion in Ondemand
  public static void FN_recursionBadx(int k, Object d) {
    if (k == 0) return;
    InferTaint.inferSensitiveSink(d);
    FN_recursionBadx(k - 1, InferTaint.inferSecretSource());
  }
}