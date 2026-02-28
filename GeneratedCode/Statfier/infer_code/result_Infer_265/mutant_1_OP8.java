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
    // Mutant
    Object x = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } catch (Exception a) {
      InferTaint.inferSensitiveSink(x);
    }
  }

  public static void sinkInCatchBad2() {
    Object source = null;
    try {
      source = InferTaint.inferSecretSource();
      mayExcept();
    } catch (Exception e) {
      InferTaint.inferSensitiveSink(source);
    }
    // Mutant
    Object y = null;
    try {
      y = InferTaint.inferSecretSource();
      mayExcept();
    } catch (Exception b) {
      InferTaint.inferSensitiveSink(y);
    }
  }

  public static void sinkAfterCatchBad() {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
      source = null;
    } catch (Exception e) {
    }
    InferTaint.inferSensitiveSink(source);
    // Mutant
    Object z = InferTaint.inferSecretSource();
    try {
      mayExcept();
      z = null;
    } catch (Exception c) {
    }
    InferTaint.inferSensitiveSink(z);
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
    // Mutant
    Object w = InferTaint.inferSecretSource();
    try {
      mayExcept();
      w = null;
    } catch (Exception d) {
      w = null;
    }
    InferTaint.inferSensitiveSink(w);
  }

  public static void sinkInFinallyBad1() throws Exception {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      InferTaint.inferSensitiveSink(source);
    }
    // Mutant
    Object v = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      InferTaint.inferSensitiveSink(v);
    }
  }

  public static void sinkInFinallyBad2() throws Exception {
    Object source = null;
    try {
      mayExcept();
      source = InferTaint.inferSecretSource();
    } finally {
      InferTaint.inferSensitiveSink(source);
    }
    // Mutant
    Object u = null;
    try {
      mayExcept();
      u = InferTaint.inferSecretSource();
    } finally {
      InferTaint.inferSensitiveSink(u);
    }
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
    // Mutant
    Object t = null;
    try {
      mayExcept();
    } catch (Exception f) {
      t = InferTaint.inferSecretSource();
    } finally {
      InferTaint.inferSensitiveSink(t);
    }
  }

  public static void sinkAfterFinallyOk1() throws Exception {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      source = null;
    }
    InferTaint.inferSensitiveSink(source);
    // Mutant
    Object s = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      s = null;
    }
    InferTaint.inferSensitiveSink(s);
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
    // Mutant
    Object r = null;
    try {
      mayExcept();
      r = InferTaint.inferSecretSource();
    } catch (Exception g) {
      r = InferTaint.inferSecretSource();
    } finally {
      r = null;
    }
    InferTaint.inferSensitiveSink(r);
  }

  public static void callSinkThenThrow(Object param) throws Exception {
    InferTaint.inferSensitiveSink(param);
    throw new Exception();
  }

  public static void callSinkThenThrowBad() throws Exception {
    callSinkThenThrow(InferTaint.inferSecretSource());
    // Mutant
    Object q = InferTaint.inferSecretSource();
    callSinkThenThrow(q);
  }

  public static void doThrow(Object param) throws RuntimeException {
    throw new RuntimeException(param.toString());
  }

  // false negative; need to track flow into and out of exceptions to get this (t14159157)
  public static void FN_callSink() {
    try {
      doThrow(InferTaint.inferSecretSource());
    } catch (RuntimeException e) {
      InferTaint.inferSensitiveSink(e);
    }
    // Mutant
    try {
      doThrow(InferTaint.inferSecretSource());
    } catch (RuntimeException h) {
      InferTaint.inferSensitiveSink(h);
    }
  }
}