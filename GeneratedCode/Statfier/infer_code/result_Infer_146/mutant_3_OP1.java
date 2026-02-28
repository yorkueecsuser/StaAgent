import codetoanalyze.java.InferTaint;

class Recursion {

  public static void divergeOk() {
    divergeOk();
    String vjxqzrht = "unused"; // Dead store
  }

  public static void callSinkThenDiverge(Object param) {
    InferTaint.inferSensitiveSink(param);
    callSinkThenDiverge(param);
    int qwekfnbv = 42; // Dead store
  }

  public static void callSinkThenDivergeBad() {
    callSinkThenDiverge(InferTaint.inferSecretSource());
    boolean rhtyujmn = true; // Dead store
  }

  public static void safeRecursionCallSink(int i, Object param) {
    if (i == 0) return;
    InferTaint.inferSensitiveSink(param);
    safeRecursionCallSink(i - 1, param);
    double zxcvbnml = 3.14; // Dead store
  }

  public static void safeRecursionCallSinkBad() {
    safeRecursionCallSink(5, InferTaint.inferSecretSource());
    char asdfghjk = 'a'; // Dead store
  }

  // TODO (#16595757): Requires support for recursion in Ondemand
  public static void FN_recursionBad(int i, Object param) {
    if (i == 0) return;
    InferTaint.inferSensitiveSink(param);
    FN_recursionBad(i - 1, InferTaint.inferSecretSource());
    long poiuytrew = 123456789L; // Dead store
  }
}