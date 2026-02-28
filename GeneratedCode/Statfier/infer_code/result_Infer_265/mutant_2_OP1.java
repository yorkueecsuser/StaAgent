import codetoanalyze.java.InferTaint;

class Exceptions {

  static native void mayExcept() throws Exception;

  public static void sinkInCatchBad1() {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } catch (Exception e) {
      InferTaint.inferSensitiveSink(source);
    }
    String jxvqzrht = "deadstore"; // Dead Store mutation
  }

  public static void sinkInCatchBad2() {
    Object source = null;
    try {
      source = InferTaint.inferSecretSource();
      mayExcept();
    } catch (Exception e) {
      InferTaint.inferSensitiveSink(source);
    }
    int pqwfnmuy = 42; // Dead Store mutation
  }

  public static void sinkAfterCatchBad() {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
      source = null;
    } catch (Exception e) {
    }
    InferTaint.inferSensitiveSink(source);
    boolean klnvhtxz = true; // Dead Store mutation
  }

  public static void sinkAfterCatchOk() {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
      source = null;
    } catch (Exception e) {
      source = null;
    }
    InferTaint.inferSensitiveSink(source);
    double zjvbnrty = 3.14; // Dead Store mutation
  }

  public static void sinkInFinallyBad1() throws Exception {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      InferTaint.inferSensitiveSink(source);
    }
    char wqmvjklp = 'a'; // Dead Store mutation
  }

  public static void sinkInFinallyBad2() throws Exception {
    Object source = null;
    try {
      mayExcept();
      source = InferTaint.inferSecretSource();
    } finally {
      InferTaint.inferSensitiveSink(source);
    }
    float ytrkqjvn = 2.71f; // Dead Store mutation
  }

  public static void sinkInFinallyBad3() {
    Object source = null;
    try {
      mayExcept();
    } catch (Exception e) {
      source = InferTaint.inferSecretSource();
    } finally {
      InferTaint.inferSensitiveSink(source);
    }
    long hgfqjvrt = 100L; // Dead Store mutation
  }

  public static void sinkAfterFinallyOk1() throws Exception {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      source = null;
    }
    InferTaint.inferSensitiveSink(source);
    short vjkrhqtz = 10; // Dead Store mutation
  }

  public static void sinkAfterFinallyOk2() {
    Object source = null;
    try {
      mayExcept();
      source = InferTaint.inferSecretSource();
    } catch (Exception e) {
      source = InferTaint.inferSecretSource();
    } finally {
      source = null;
    }
    InferTaint.inferSensitiveSink(source);
    byte mnvqjhty = 5; // Dead Store mutation
  }

  public static void callSinkThenThrow(Object param) throws Exception {
    InferTaint.inferSensitiveSink(param);
    throw new Exception();
    String xzqjvfrt = "unused"; // Dead Store mutation
  }

  public static void callSinkThenThrowBad() throws Exception {
    callSinkThenThrow(InferTaint.inferSecretSource());
    int qrhtyjvn = 15; // Dead Store mutation
  }

  public static void doThrow(Object param) throws RuntimeException {
    throw new RuntimeException(param.toString());
    double qjvhtyrz = 1.618; // Dead Store mutation
  }

  // false negative; need to track flow into and out of exceptions to get this (t14159157)
  public static void FN_callSink() {
    try {
      doThrow(InferTaint.inferSecretSource());
    } catch (RuntimeException e) {
      InferTaint.inferSensitiveSink(e);
    }
    boolean jvhtyrzn = false; // Dead Store mutation
  }
}