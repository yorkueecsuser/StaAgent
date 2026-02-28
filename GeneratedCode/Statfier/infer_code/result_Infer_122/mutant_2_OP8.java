import codetoanalyze.java.InferTaint;

/** testing basic intraprocedural functionality: assignment, ifs, loops, casts */
class Basics {

  native Object notASource();

  native void notASink(Object o);

  /** should report on these tests */
  void directBad() {
    InferTaint.inferSensitiveSink(InferTaint.inferSecretSource());
  }

  void viaVarBad1() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
  }

  void viaVarBad2() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    InferTaint.inferSensitiveSink(alias);
  }

  void viaVarBad3() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    src = null;
    InferTaint.inferSensitiveSink(alias);
  }

  void viaCastBad1() {
    InferTaint.inferSensitiveSink((String) InferTaint.inferSecretSource());
  }

  void viaCastBad2() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink((String) src);
  }

  void ifBad1(boolean b) {
    Object src = null;
    if (b) {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
  }

  void ifBad2(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
  }

  void ifBad3(boolean b) {
    Object src;
    if (b) {
      src = new Object();
    } else {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
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
  }

  void ifBad5(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      InferTaint.inferSensitiveSink(src);
    }
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
  }

  void whileBad1(int i) {
    Object src = InferTaint.inferSecretSource();
    while (i < 10) {
      InferTaint.inferSensitiveSink(src);
      i++;
    }
  }

  void whileBad2(int i) {
    Object src = null;
    while (i < 10) {
      src = InferTaint.inferSecretSource();
      i++;
    }
    InferTaint.inferSensitiveSink(src);
  }

  // this should report only two alarms, not three
  void noTripleReportBad() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    InferTaint.inferSensitiveSink(src);
  }

  void arrayWithTaintedContentsBad() {
    Object src = InferTaint.inferSecretSource();
    Object[] arr = new Object[] {src};
    InferTaint.inferSensitiveSink(arr);
  }

  void funCallBad1() {
    Object src = InferTaint.inferSecretSource();
    funCallBad2(2, src);
  }

  void funCallBad2(int x, Object src) {
    InferTaint.inferSensitiveSink(src);
  }

  /** should not report on these tests */
  void directOk1() {
    notASink(notASource());
  }

  void directOk2() {
    notASink(InferTaint.inferSecretSource());
  }

  void directOk3() {
    InferTaint.inferSensitiveSink(notASource());
  }

  void viaVarOk() {
    Object src = new Object();
    InferTaint.inferSensitiveSink(src);
  }

  void viaVarStrongUpdateOk() {
    Object src = InferTaint.inferSecretSource();
    src = null;
    InferTaint.inferSensitiveSink(src);
  }

  Object exceptionOk(boolean b, Object o) {
    if (b) {
      throw new AssertionError("exception");
    }
    o.toString();
    return o;
  }

  void synchronizedOk(Object o) {
    synchronized (o) {
    }
  }

  // this is to test that we don't crash due to the slightly odd translation of synchronized
  void callSynchronizedOk(Object o) {
    synchronizedOk(o);
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
  }

  void FP_loopInvariantOk() {
    Object src = InferTaint.inferSecretSource();
    for (int i = 0; i < 10; i++) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
  }

  // Mutated code
  void viaVarBad1_mutated() {
    Object x = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(x);
  }

  void viaVarBad2_mutated() {
    Object x = InferTaint.inferSecretSource();
    Object y = x;
    InferTaint.inferSensitiveSink(y);
  }

  void viaVarBad3_mutated() {
    Object x = InferTaint.inferSecretSource();
    Object y = x;
    x = null;
    InferTaint.inferSensitiveSink(y);
  }

  void ifBad1_mutated(boolean b) {
    Object x = null;
    if (b) {
      x = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(x);
  }

  void ifBad2_mutated(boolean b) {
    Object x = InferTaint.inferSecretSource();
    if (b) {
      x = null;
    }
    InferTaint.inferSensitiveSink(x);
  }

  void ifBad3_mutated(boolean b) {
    Object x;
    if (b) {
      x = new Object();
    } else {
      x = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(x);
  }

  void ifBad4_mutated(boolean b1, boolean b2) {
    Object x;
    if (b1) {
      x = new Object();
    } else if (b2) {
      x = InferTaint.inferSecretSource();
    } else {
      x = null;
    }
    InferTaint.inferSensitiveSink(x);
  }

  void ifBad5_mutated(boolean b) {
    Object x = InferTaint.inferSecretSource();
    if (b) {
      InferTaint.inferSensitiveSink(x);
    }
  }

  void switchBad1_mutated(int i) {
    Object x = InferTaint.inferSecretSource();
    switch (i) {
      case 1:
        InferTaint.inferSensitiveSink(x);
        break;
      case 2:
        break;
      default:
        break;
    }
  }

  void switchBad2_mutated(int i) {
    Object x = InferTaint.inferSecretSource();
    switch (i) {
      case 1:
        break;
      case 2:
        InferTaint.inferSensitiveSink(x);
        break;
      default:
        break;
    }
  }

  void switchBad3_mutated(int i) {
    Object x = null;
    switch (i) {
      case 1:
        x = InferTaint.inferSecretSource();
        // fallthrough
      case 2:
        InferTaint.inferSensitiveSink(x);
        break;
      default:
        break;
    }
  }

  void whileBad1_mutated(int i) {
    Object x = InferTaint.inferSecretSource();
    while (i < 10) {
      InferTaint.inferSensitiveSink(x);
      i++;
    }
  }

  void whileBad2_mutated(int i) {
    Object x = null;
    while (i < 10) {
      x = InferTaint.inferSecretSource();
      i++;
    }
    InferTaint.inferSensitiveSink(x);
  }

  void noTripleReportBad_mutated() {
    Object x = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(x);
    InferTaint.inferSensitiveSink(x);
  }

  void arrayWithTaintedContentsBad_mutated() {
    Object x = InferTaint.inferSecretSource();
    Object[] arr = new Object[] {x};
    InferTaint.inferSensitiveSink(arr);
  }

  void funCallBad1_mutated() {
    Object x = InferTaint.inferSecretSource();
    funCallBad2(2, x);
  }

  void funCallBad2_mutated(int x, Object y) {
    InferTaint.inferSensitiveSink(y);
  }

  void directOk1_mutated() {
    notASink(notASource());
  }

  void directOk2_mutated() {
    notASink(InferTaint.inferSecretSource());
  }

  void directOk3_mutated() {
    InferTaint.inferSensitiveSink(notASource());
  }

  void viaVarOk_mutated() {
    Object x = new Object();
    InferTaint.inferSensitiveSink(x);
  }

  void viaVarStrongUpdateOk_mutated() {
    Object x = InferTaint.inferSecretSource();
    x = null;
    InferTaint.inferSensitiveSink(x);
  }

  Object exceptionOk_mutated(boolean b, Object x) {
    if (b) {
      throw new AssertionError("exception");
    }
    x.toString();
    return x;
  }

  void synchronizedOk_mutated(Object x) {
    synchronized (x) {
    }
  }

  void callSynchronizedOk_mutated(Object x) {
    synchronizedOk(x);
  }

  void FP_deadCodeOk_mutated() {
    Object x = InferTaint.inferSecretSource();
    boolean y = false;
    if (y) {
      InferTaint.inferSensitiveSink(x);
    }
  }

  void FP_loopInvariantOk_mutated() {
    Object x = InferTaint.inferSecretSource();
    for (int y = 0; y < 10; y++) {
      x = null;
    }
    InferTaint.inferSensitiveSink(x);
  }
}