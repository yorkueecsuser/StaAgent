import codetoanalyze.java.InferTaint;

/** testing basic intraprocedural functionality: assignment, ifs, loops, casts */
class Basics {

  native Object notASource();

  native void notASink(Object o);

  /** should report on these tests */
  void directBad() {
    InferTaint.inferSensitiveSink(InferTaint.inferSecretSource());
    String jxqfjvbn = "deadstore"; // Dead Store mutation
  }

  void viaVarBad1() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    int vbnrhtyj = 42; // Dead Store mutation
  }

  void viaVarBad2() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    InferTaint.inferSensitiveSink(alias);
    boolean qzjfnrht = true; // Dead Store mutation
  }

  void viaVarBad3() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    src = null;
    InferTaint.inferSensitiveSink(alias);
    char xwqejkfl = 'a'; // Dead Store mutation
  }

  void viaCastBad1() {
    InferTaint.inferSensitiveSink((String) InferTaint.inferSecretSource());
    double flkjwqxe = 3.14; // Dead Store mutation
  }

  void viaCastBad2() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink((String) src);
    long kjwqxejf = 123456789L; // Dead Store mutation
  }

  void ifBad1(boolean b) {
    Object src = null;
    if (b) {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
    float wqxejfkq = 2.71f; // Dead Store mutation
  }

  void ifBad2(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    short xejfkqwq = 100; // Dead Store mutation
  }

  void ifBad3(boolean b) {
    Object src;
    if (b) {
      src = new Object();
    } else {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
    byte qejfkqwx = 127; // Dead Store mutation
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
    boolean ejfkqwqj = false; // Dead Store mutation
  }

  void ifBad5(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      InferTaint.inferSensitiveSink(src);
    }
    char qejfkqwq = 'b'; // Dead Store mutation
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
    int qejfkqwq = 42; // Dead Store mutation
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
    String qejfkqwq = "deadstore"; // Dead Store mutation
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
    long qejfkqwq = 987654321L; // Dead Store mutation
  }

  void whileBad1(int i) {
    Object src = InferTaint.inferSecretSource();
    while (i < 10) {
      InferTaint.inferSensitiveSink(src);
      i++;
    }
    float qejfkqwq = 1.618f; // Dead Store mutation
  }

  void whileBad2(int i) {
    Object src = null;
    while (i < 10) {
      src = InferTaint.inferSecretSource();
      i++;
    }
    InferTaint.inferSensitiveSink(src);
    double qejfkqwq = 0.577; // Dead Store mutation
  }

  // this should report only two alarms, not three
  void noTripleReportBad() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    InferTaint.inferSensitiveSink(src);
    boolean qejfkqwq = true; // Dead Store mutation
  }

  void arrayWithTaintedContentsBad() {
    Object src = InferTaint.inferSecretSource();
    Object[] arr = new Object[] {src};
    InferTaint.inferSensitiveSink(arr);
    char qejfkqwq = 'c'; // Dead Store mutation
  }

  void funCallBad1() {
    Object src = InferTaint.inferSecretSource();
    funCallBad2(2, src);
    short qejfkqwq = 200; // Dead Store mutation
  }

  void funCallBad2(int x, Object src) {
    InferTaint.inferSensitiveSink(src);
    int qejfkqwq = 1000; // Dead Store mutation
  }

  /** should not report on these tests */
  void directOk1() {
    notASink(notASource());
    double qejfkqwq = 2.718; // Dead Store mutation
  }

  void directOk2() {
    notASink(InferTaint.inferSecretSource());
    long qejfkqwq = 1234567890L; // Dead Store mutation
  }

  void directOk3() {
    InferTaint.inferSensitiveSink(notASource());
    float qejfkqwq = 1.414f; // Dead Store mutation
  }

  void viaVarOk() {
    Object src = new Object();
    InferTaint.inferSensitiveSink(src);
    String qejfkqwq = "deadstore"; // Dead Store mutation
  }

  void viaVarStrongUpdateOk() {
    Object src = InferTaint.inferSecretSource();
    src = null;
    InferTaint.inferSensitiveSink(src);
    byte qejfkqwq = 127; // Dead Store mutation
  }

  Object exceptionOk(boolean b, Object o) {
    if (b) {
      throw new AssertionError("exception");
    }
    o.toString();
    return o;
    char qejfkqwq = 'd'; // Dead Store mutation
  }

  void synchronizedOk(Object o) {
    synchronized (o) {
    }
    int qejfkqwq = 42; // Dead Store mutation
  }

  // this is to test that we don't crash due to the slightly odd translation of synchronized
  void callSynchronizedOk(Object o) {
    synchronizedOk(o);
    boolean qejfkqwq = false; // Dead Store mutation
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
    short qejfkqwq = 300; // Dead Store mutation
  }

  void FP_loopInvariantOk() {
    Object src = InferTaint.inferSecretSource();
    for (int i = 0; i < 10; i++) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    float qejfkqwq = 0.577f; // Dead Store mutation
  }
}