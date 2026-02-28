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
    Object b = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } catch (Exception x) {
      InferTaint.inferSensitiveSink(b);
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
    Object c = null;
    try {
      c = InferTaint.inferSecretSource();
      mayExcept();
    } catch (Exception f) {
      InferTaint.inferSensitiveSink(c);
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
    Object d = InferTaint.inferSecretSource();
    try {
      mayExcept();
      d = null;
    } catch (Exception g) {
    }
    InferTaint.inferSensitiveSink(d);
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
    Object h = InferTaint.inferSecretSource();
    try {
      mayExcept();
      h = null;
    } catch (Exception i) {
      h = null;
    }
    InferTaint.inferSensitiveSink(h);
  }

  public static void sinkInFinallyBad1() throws Exception {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      InferTaint.inferSensitiveSink(source);
    }
    // Mutant
    Object j = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      InferTaint.inferSensitiveSink(j);
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
    Object k = null;
    try {
      mayExcept();
      k = InferTaint.inferSecretSource();
    } finally {
      InferTaint.inferSensitiveSink(k);
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
    Object l = null;
    try {
      mayExcept();
    } catch (Exception m) {
      l = InferTaint.inferSecretSource();
    } finally {
      InferTaint.inferSensitiveSink(l);
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
    Object n = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      n = null;
    }
    InferTaint.inferSensitiveSink(n);
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
    Object o = null;
    try {
      mayExcept();
      o = InferTaint.inferSecretSource();
    } catch (Exception p) {
      o = InferTaint.inferSecretSource();
    } finally {
      o = null;
    }
    InferTaint.inferSensitiveSink(o);
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
    } catch (RuntimeException r) {
      InferTaint.inferSensitiveSink(r);
    }
  }
}