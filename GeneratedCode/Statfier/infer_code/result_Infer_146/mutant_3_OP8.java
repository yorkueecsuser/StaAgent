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
  public static void divergeOkMutant() {
    divergeOkMutant();
  }

  public static void callSinkThenDivergeMutant(Object b) {
    InferTaint.inferSensitiveSink(b);
    callSinkThenDivergeMutant(b);
  }

  public static void callSinkThenDivergeBadMutant() {
    callSinkThenDivergeMutant(InferTaint.inferSecretSource());
  }

  public static void safeRecursionCallSinkMutant(int a, Object c) {
    if (a == 0) return;
    InferTaint.inferSensitiveSink(c);
    safeRecursionCallSinkMutant(a - 1, c);
  }

  public static void safeRecursionCallSinkBadMutant() {
    safeRecursionCallSinkMutant(5, InferTaint.inferSecretSource());
  }

  // TODO (#16595757): Requires support for recursion in Ondemand
  public static void FN_recursionBadMutant(int d, Object e) {
    if (d == 0) return;
    InferTaint.inferSensitiveSink(e);
    FN_recursionBadMutant(d - 1, InferTaint.inferSecretSource());
  }
}