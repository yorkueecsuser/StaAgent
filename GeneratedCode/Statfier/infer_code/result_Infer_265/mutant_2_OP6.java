import codetoanalyze.java.InferTaint;

class Exceptions {

  static native void mayExcept() throws Exception;

  public static void sinkInCatchBad1() {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } catch (Exception e) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      InferTaint.inferSensitiveSink(source);
    }
  }

  public static void sinkInCatchBad2() {
    Object source = null;
    try {
      source = InferTaint.inferSecretSource();
      mayExcept();
    } catch (Exception e) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      InferTaint.inferSensitiveSink(source);
    }
  }

  public static void sinkAfterCatchBad() {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
      source = null;
    } catch (Exception e) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }
    InferTaint.inferSensitiveSink(source);
  }

  public static void sinkAfterCatchOk() {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
      source = null;
    } catch (Exception e) {
      source = null;
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }
    InferTaint.inferSensitiveSink(source);
  }

  public static void sinkInFinallyBad1() throws Exception {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      InferTaint.inferSensitiveSink(source);
    }
  }

  public static void sinkInFinallyBad2() throws Exception {
    Object source = null;
    try {
      mayExcept();
      source = InferTaint.inferSecretSource();
    } finally {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      InferTaint.inferSensitiveSink(source);
    }
  }

  public static void sinkInFinallyBad3() {
    Object source = null;
    try {
      mayExcept();
    } catch (Exception e) {
      source = InferTaint.inferSecretSource();
    } finally {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      InferTaint.inferSensitiveSink(source);
    }
  }

  public static void sinkAfterFinallyOk1() throws Exception {
    Object source = InferTaint.inferSecretSource();
    try {
      mayExcept();
    } finally {
      source = null;
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }
    InferTaint.inferSensitiveSink(source);
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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }
    InferTaint.inferSensitiveSink(source);
  }

  public static void callSinkThenThrow(Object param) throws Exception {
    InferTaint.inferSensitiveSink(param);
    throw new Exception();
  }

  public static void callSinkThenThrowBad() throws Exception {
    callSinkThenThrow(InferTaint.inferSecretSource());
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  public static void doThrow(Object param) throws RuntimeException {
    throw new RuntimeException(param.toString());
  }

  // false negative; need to track flow into and out of exceptions to get this (t14159157)
  public static void FN_callSink() {
    try {
      doThrow(InferTaint.inferSecretSource());
    } catch (RuntimeException e) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
      InferTaint.inferSensitiveSink(e);
    }
  }

  private static boolean getCondition() {
    return false;
  }
}