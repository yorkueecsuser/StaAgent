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
    // Mutant
    Object a = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(a);
  }

  void viaVarBad2() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    InferTaint.inferSensitiveSink(alias);
    // Mutant
    Object b = src;
    InferTaint.inferSensitiveSink(b);
  }

  void viaVarBad3() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    src = null;
    InferTaint.inferSensitiveSink(alias);
    // Mutant
    Object c = src;
    InferTaint.inferSensitiveSink(c);
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
    // Mutant
    Object d = null;
    if (b) {
      d = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(d);
  }

  void ifBad2(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    // Mutant
    Object e = InferTaint.inferSecretSource();
    if (b) {
      e = null;
    }
    InferTaint.inferSensitiveSink(e);
  }

  void ifBad3(boolean b) {
    Object src;
    if (b) {
      src = new Object();
    } else {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
    // Mutant
    Object f;
    if (b) {
      f = new Object();
    } else {
      f = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(f);
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
    // Mutant
    Object g;
    if (b1) {
      g = new Object();
    } else if (b2) {
      g = InferTaint.inferSecretSource();
    } else {
      g = null;
    }
    InferTaint.inferSensitiveSink(g);
  }

  void ifBad5(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      InferTaint.inferSensitiveSink(src);
    }
    // Mutant
    Object h = InferTaint.inferSecretSource();
    if (b) {
      InferTaint.inferSensitiveSink(h);
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
    // Mutant
    Object j = InferTaint.inferSecretSource();
    switch (i) {
      case 1:
        InferTaint.inferSensitiveSink(j);
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
    // Mutant
    Object k = InferTaint.inferSecretSource();
    switch (i) {
      case 1:
        break;
      case 2:
        InferTaint.inferSensitiveSink(k);
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
    // Mutant
    Object l = null;
    switch (i) {
      case 1:
        l = InferTaint.inferSecretSource();
        // fallthrough
      case 2:
        InferTaint.inferSensitiveSink(l);
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
    // Mutant
    Object m = InferTaint.inferSecretSource();
    while (i < 10) {
      InferTaint.inferSensitiveSink(m);
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
    // Mutant
    Object n = null;
    while (i < 10) {
      n = InferTaint.inferSecretSource();
      i++;
    }
    InferTaint.inferSensitiveSink(n);
  }

  // this should report only two alarms, not three
  void noTripleReportBad() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    InferTaint.inferSensitiveSink(src);
    // Mutant
    Object o = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(o);
    InferTaint.inferSensitiveSink(o);
  }

  void arrayWithTaintedContentsBad() {
    Object src = InferTaint.inferSecretSource();
    Object[] arr = new Object[] {src};
    InferTaint.inferSensitiveSink(arr);
    // Mutant
    Object p = InferTaint.inferSecretSource();
    Object[] arr2 = new Object[] {p};
    InferTaint.inferSensitiveSink(arr2);
  }

  void funCallBad1() {
    Object src = InferTaint.inferSecretSource();
    funCallBad2(2, src);
    // Mutant
    Object q = InferTaint.inferSecretSource();
    funCallBad2(2, q);
  }

  void funCallBad2(int x, Object src) {
    InferTaint.inferSensitiveSink(src);
    // Mutant
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
    // Mutant
    Object r = new Object();
    InferTaint.inferSensitiveSink(r);
  }

  void viaVarStrongUpdateOk() {
    Object src = InferTaint.inferSecretSource();
    src = null;
    InferTaint.inferSensitiveSink(src);
    // Mutant
    Object s = InferTaint.inferSecretSource();
    s = null;
    InferTaint.inferSensitiveSink(s);
  }

  Object exceptionOk(boolean b, Object o) {
    if (b) {
      throw new AssertionError("exception");
    }
    o.toString();
    return o;
    // Mutant
    Object t = o;
    t.toString();
    return t;
  }

  void synchronizedOk(Object o) {
    synchronized (o) {
    }
    // Mutant
    Object u = o;
    synchronized (u) {
    }
  }

  // this is to test that we don't crash due to the slightly odd translation of synchronized
  void callSynchronizedOk(Object o) {
    synchronizedOk(o);
    // Mutant
    Object v = o;
    synchronizedOk(v);
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
    // Mutant
    Object w = InferTaint.inferSecretSource();
    boolean c = false;
    if (c) {
      InferTaint.inferSensitiveSink(w);
    }
  }

  void FP_loopInvariantOk() {
    Object src = InferTaint.inferSecretSource();
    for (int i = 0; i < 10; i++) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    // Mutant
    Object x = InferTaint.inferSecretSource();
    for (int i = 0; i < 10; i++) {
      x = null;
    }
    InferTaint.inferSensitiveSink(x);
  }
}