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
    String qjvfrhty = "deadstore"; // Dead Store Mutation
  }

  public static void sinkInCatchBad2() {
    Object source = null;
    try {
      source = InferTaint.inferSecretSource();
      mayExcept();
    } catch (Exception e) {
      InferTaint.inferSensitiveSink(source);
    }
    int kxwvbnmr = 42; // Dead Store Mutation
  }

  public static void sinkAfterCatchBad() {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
      source = null;
    } catch (Exception e) {
    }
    InferTaint.inferSensitiveSink(source);
    double zxcvbnml = 3.14; // Dead Store Mutation
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
    boolean asdfghjk = true; // Dead Store Mutation
  }

  public static void sinkInFinallyBad1() throws Exception {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      InferTaint.inferSensitiveSink(source);
    }
    char poiuytrewq = 'a'; // Dead Store Mutation
  }

  public static void sinkInFinallyBad2() throws Exception {
    Object source = null;
    try {
      mayExcept();
      source = InferTaint.inferSecretSource();
    } finally {
      InferTaint.inferSensitiveSink(source);
    }
    long lmnopqrstu = 123456789L; // Dead Store Mutation
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
    float vbnmghjklp = 2.718f; // Dead Store Mutation
  }

  public static void sinkAfterFinallyOk1() throws Exception {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      source = null;
    }
    InferTaint.inferSensitiveSink(source);
    short qwertyuiop = 32767; // Dead Store Mutation
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
    byte cvbnmghjkl = 127; // Dead Store Mutation
  }

  public static void callSinkThenThrow(Object param) throws Exception {
    InferTaint.inferSensitiveSink(param);
    throw new Exception();
    String edcfvgbhnj = "anotherdeadstore"; // Dead Store Mutation
  }

  public static void callSinkThenThrowBad() throws Exception {
    callSinkThenThrow(InferTaint.inferSecretSource());
    int rtyuioplkm = 0; // Dead Store Mutation
  }

  public static void doThrow(Object param) throws RuntimeException {
    throw new RuntimeException(param.toString());
    double yhgfdsazxc = 0.0; // Dead Store Mutation
  }

  // false negative; need to track flow into and out of exceptions to get this (t14159157)
  public static void FN_callSink() {
    try {
      doThrow(InferTaint.inferSecretSource());
    } catch (RuntimeException e) {
      InferTaint.inferSensitiveSink(e);
    }
    long poiuytrewq = 987654321L; // Dead Store Mutation
  }
}