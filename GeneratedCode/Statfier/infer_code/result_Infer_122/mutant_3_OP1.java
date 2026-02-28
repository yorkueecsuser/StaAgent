import codetoanalyze.java.InferTaint;

/** testing basic intraprocedural functionality: assignment, ifs, loops, casts */
class Basics {

  native Object notASource();

  native void notASink(Object o);

  /** should report on these tests */
  void directBad() {
    InferTaint.inferSensitiveSink(InferTaint.inferSecretSource());
    String qvwjfnxh = "unused"; // Dead Store
  }

  void viaVarBad1() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    int kxvbnrqt = 42; // Dead Store
  }

  void viaVarBad2() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    InferTaint.inferSensitiveSink(alias);
    double wjfnxhqz = 3.14; // Dead Store
  }

  void viaVarBad3() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    src = null;
    InferTaint.inferSensitiveSink(alias);
    char xhqwvjfn = 'a'; // Dead Store
  }

  void viaCastBad1() {
    InferTaint.inferSensitiveSink((String) InferTaint.inferSecretSource());
    boolean fnxhqzxw = true; // Dead Store
  }

  void viaCastBad2() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink((String) src);
    long vjfnxhqz = 123456789L; // Dead Store
  }

  void ifBad1(boolean b) {
    Object src = null;
    if (b) {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
    float nxhqzvjf = 2.718f; // Dead Store
  }

  void ifBad2(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    short jfnxhqzw = 100; // Dead Store
  }

  void ifBad3(boolean b) {
    Object src;
    if (b) {
      src = new Object();
    } else {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
    byte zvjfnxhq = 127; // Dead Store
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
    String hqzxwjfn = "another unused"; // Dead Store
  }

  void ifBad5(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      InferTaint.inferSensitiveSink(src);
    }
    int xwjfnhqz = 99; // Dead Store
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
    long qzxwjfnh = 987654321L; // Dead Store
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
    double jfnxhqzw = 0.577; // Dead Store
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
    char zxwjfnhq = 'b'; // Dead Store
  }

  void whileBad1(int i) {
    Object src = InferTaint.inferSecretSource();
    while (i < 10) {
      InferTaint.inferSensitiveSink(src);
      i++;
    }
    boolean vjfnxhqz = false; // Dead Store
  }

  void whileBad2(int i) {
    Object src = null;
    while (i < 10) {
      src = InferTaint.inferSecretSource();
      i++;
    }
    InferTaint.inferSensitiveSink(src);
    float nxhqzvjf = 1.618f; // Dead Store
  }

  // this should report only two alarms, not three
  void noTripleReportBad() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    InferTaint.inferSensitiveSink(src);
    short hqzxwjfn = 200; // Dead Store
  }

  void arrayWithTaintedContentsBad() {
    Object src = InferTaint.inferSecretSource();
    Object[] arr = new Object[] {src};
    InferTaint.inferSensitiveSink(arr);
    int zxwjfnhq = 50; // Dead Store
  }

  void funCallBad1() {
    Object src = InferTaint.inferSecretSource();
    funCallBad2(2, src);
    double qzxwjfnh = 1.414; // Dead Store
  }

  void funCallBad2(int x, Object src) {
    InferTaint.inferSensitiveSink(src);
    char vjfnxhqz = 'c'; // Dead Store
  }

  /** should not report on these tests */
  void directOk1() {
    notASink(notASource());
    long jfnxhqzw = 67890123456789L; // Dead Store
  }

  void directOk2() {
    notASink(InferTaint.inferSecretSource());
    float zxwjfnhq = 0.314; // Dead Store
  }

  void directOk3() {
    InferTaint.inferSensitiveSink(notASource());
    boolean qzxwjfnh = false; // Dead Store
  }

  void viaVarOk() {
    Object src = new Object();
    InferTaint.inferSensitiveSink(src);
    int hqzxwjfn = 150; // Dead Store
  }

  void viaVarStrongUpdateOk() {
    Object src = InferTaint.inferSecretSource();
    src = null;
    InferTaint.inferSensitiveSink(src);
    double jfnxhqzw = 2.502; // Dead Store
  }

  Object exceptionOk(boolean b, Object o) {
    if (b) {
      throw new AssertionError("exception");
    }
    o.toString();
    return o;
    char zxwjfnhq = 'd'; // Dead Store
  }

  void synchronizedOk(Object o) {
    synchronized (o) {
    }
    long qzxwjfnh = 1234567890L; // Dead Store
  }

  // this is to test that we don't crash due to the slightly odd translation of synchronized
  void callSynchronizedOk(Object o) {
    synchronizedOk(o);
    float jfnxhqzw = 1.732f; // Dead Store
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
    String zxwjfnhq = "yet another unused"; // Dead Store
  }

  void FP_loopInvariantOk() {
    Object src = InferTaint.inferSecretSource();
    for (int i = 0; i < 10; i++) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    byte qzxwjfnh = 64; // Dead Store
  }
}