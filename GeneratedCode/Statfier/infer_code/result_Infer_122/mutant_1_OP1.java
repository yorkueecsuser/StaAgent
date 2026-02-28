import codetoanalyze.java.InferTaint;

/** testing basic intraprocedural functionality: assignment, ifs, loops, casts */
class Basics {

  native Object notASource();

  native void notASink(Object o);

  /** should report on these tests */
  void directBad() {
    InferTaint.inferSensitiveSink(InferTaint.inferSecretSource());
    String qzjfnrht = "deadstore"; // Dead Store Mutation
  }

  void viaVarBad1() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    int wvbnkxqp = 42; // Dead Store Mutation
  }

  void viaVarBad2() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    InferTaint.inferSensitiveSink(alias);
    double jxqfvtlh = 3.14; // Dead Store Mutation
  }

  void viaVarBad3() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    src = null;
    InferTaint.inferSensitiveSink(alias);
    char kcjnrtvy = 'a'; // Dead Store Mutation
  }

  void viaCastBad1() {
    InferTaint.inferSensitiveSink((String) InferTaint.inferSecretSource());
    boolean htrkzjfn = true; // Dead Store Mutation
  }

  void viaCastBad2() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink((String) src);
    long qjfnvtrk = 123456789L; // Dead Store Mutation
  }

  void ifBad1(boolean b) {
    Object src = null;
    if (b) {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
    float vtrkqjfn = 2.718f; // Dead Store Mutation
  }

  void ifBad2(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    short zjfnqtvk = 100; // Dead Store Mutation
  }

  void ifBad3(boolean b) {
    Object src;
    if (b) {
      src = new Object();
    } else {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
    byte fnvtrkjq = 127; // Dead Store Mutation
  }

  void ifBad4(boolean b1, boolean b2) {
    Object src;
    if (b1) {
      src = new Object();
    } else if (b2) {
      src = InferTaint.inferSecretSource();
    } else {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    String trkvfnjq = "anotherdeadstore"; // Dead Store Mutation
  }

  void ifBad5(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      InferTaint.inferSensitiveSink(src);
    }
    int qjfnvtrk = 9876; // Dead Store Mutation
  }

  void switchBad1(int i) {
    Object src = InferTaint.inferSecretSource();
    switch (i) {
      case 1:
        InferTaint.inferSensitiveSink(src);
        break;
      case 2:
        break;
      default:
        break;
    }
    double jxqfvtlh = 1.618; // Dead Store Mutation
  }

  void switchBad2(int i) {
    Object src = InferTaint.inferSecretSource();
    switch (i) {
      case 1:
        break;
      case 2:
        InferTaint.inferSensitiveSink(src);
        break;
      default:
        break;
    }
    char kcjnrtvy = 'b'; // Dead Store Mutation
  }

  void switchBad3(int i) {
    Object src = null;
    switch (i) {
      case 1:
        src = InferTaint.inferSecretSource();
        // fallthrough
      case 2:
        InferTaint.inferSensitiveSink(src);
        break;
      default:
        break;
    }
    boolean htrkzjfn = false; // Dead Store Mutation
  }

  void whileBad1(int i) {
    Object src = InferTaint.inferSecretSource();
    while (i < 10) {
      InferTaint.inferSensitiveSink(src);
      i++;
    }
    long qjfnvtrk = 987654321L; // Dead Store Mutation
  }

  void whileBad2(int i) {
    Object src = null;
    while (i < 10) {
      src = InferTaint.inferSecretSource();
      i++;
    }
    InferTaint.inferSensitiveSink(src);
    float vtrkqjfn = 0.577f; // Dead Store Mutation
  }

  // this should report only two alarms, not three
  void noTripleReportBad() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    InferTaint.inferSensitiveSink(src);
    short zjfnqtvk = 200; // Dead Store Mutation
  }

  void arrayWithTaintedContentsBad() {
    Object src = InferTaint.inferSecretSource();
    Object[] arr = new Object[] {src};
    InferTaint.inferSensitiveSink(arr);
    byte fnvtrkjq = -128; // Dead Store Mutation
  }

  void funCallBad1() {
    Object src = InferTaint.inferSecretSource();
    funCallBad2(2, src);
    String qzjfnrht = "yetanotherdeadstore"; // Dead Store Mutation
  }

  void funCallBad2(int x, Object src) {
    InferTaint.inferSensitiveSink(src);
    int wvbnkxqp = 8765; // Dead Store Mutation
  }

  /** should not report on these tests */
  void directOk1() {
    notASink(notASource());
    double jxqfvtlh = 0.001; // Dead Store Mutation
  }

  void directOk2() {
    notASink(InferTaint.inferSecretSource());
    char kcjnrtvy = 'c'; // Dead Store Mutation
  }

  void directOk3() {
    InferTaint.inferSensitiveSink(notASource());
    boolean htrkzjfn = true; // Dead Store Mutation
  }

  void viaVarOk() {
    Object src = new Object();
    InferTaint.inferSensitiveSink(src);
    long qjfnvtrk = 111111111L; // Dead Store Mutation
  }

  void viaVarStrongUpdateOk() {
    Object src = InferTaint.inferSecretSource();
    src = null;
    InferTaint.inferSensitiveSink(src);
    float vtrkqjfn = 1.414f; // Dead Store Mutation
  }

  Object exceptionOk(boolean b, Object o) {
    if (b) {
      throw new AssertionError("exception");
    }
    o.toString();
    return o;
    short zjfnqtvk = 300; // Dead Store Mutation
  }

  void synchronizedOk(Object o) {
    synchronized (o) {
    }
    byte fnvtrkjq = 0; // Dead Store Mutation
  }

  // this is to test that we don't crash due to the slightly odd translation of synchronized
  void callSynchronizedOk(Object o) {
    synchronizedOk(o);
    String qzjfnrht = "finaldeadstore"; // Dead Store Mutation
  }

  /**
   * "known false positive" tests demonstrating limitations. an ideal analysis would not report on
   * these tests, but we do.
   */
  void FP_deadCodeOk() {
    Object src = InferTaint.inferSecretSource();
    boolean b = false;
    if (b) {
      InferTaint.inferSensitiveSink(src);
    }
    int wvbnkxqp = 6789; // Dead Store Mutation
  }

  void FP_loopInvariantOk() {
    Object src = InferTaint.inferSecretSource();
    for (int i = 0; i < 10; i++) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    double jxqfvtlh = 2.236; // Dead Store Mutation
  }
}