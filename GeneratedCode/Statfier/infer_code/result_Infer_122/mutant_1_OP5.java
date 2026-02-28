import codetoanalyze.java.InferTaint;

/** testing basic intraprocedural functionality: assignment, ifs, loops, casts */
class Basics {

  native Object notASource();

  native void notASink(Object o);

  /** should report on these tests */
  void directBad() {
    InferTaint.inferSensitiveSink(InferTaint.inferSecretSource());
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void viaVarBad1() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void viaVarBad2() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    InferTaint.inferSensitiveSink(alias);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void viaVarBad3() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    src = null;
    InferTaint.inferSensitiveSink(alias);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void viaCastBad1() {
    InferTaint.inferSensitiveSink((String) InferTaint.inferSecretSource());
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void viaCastBad2() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink((String) src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void ifBad1(boolean b) {
    Object src = null;
    if (b) {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void ifBad2(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void ifBad3(boolean b) {
    Object src;
    if (b) {
      src = new Object();
    } else {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
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
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void ifBad5(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      InferTaint.inferSensitiveSink(src);
    }
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
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
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
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
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
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
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
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
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void whileBad2(int i) {
    Object src = null;
    while (i < 10) {
      src = InferTaint.inferSecretSource();
      i++;
    }
    InferTaint.inferSensitiveSink(src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  // this should report only two alarms, not three
  void noTripleReportBad() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    InferTaint.inferSensitiveSink(src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void arrayWithTaintedContentsBad() {
    Object src = InferTaint.inferSecretSource();
    Object[] arr = new Object[] {src};
    InferTaint.inferSensitiveSink(arr);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void funCallBad1() {
    Object src = InferTaint.inferSecretSource();
    funCallBad2(2, src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void funCallBad2(int x, Object src) {
    InferTaint.inferSensitiveSink(src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  /** should not report on these tests */
  void directOk1() {
    notASink(notASource());
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void directOk2() {
    notASink(InferTaint.inferSecretSource());
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void directOk3() {
    InferTaint.inferSensitiveSink(notASource());
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void viaVarOk() {
    Object src = new Object();
    InferTaint.inferSensitiveSink(src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void viaVarStrongUpdateOk() {
    Object src = InferTaint.inferSecretSource();
    src = null;
    InferTaint.inferSensitiveSink(src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  Object exceptionOk(boolean b, Object o) {
    if (b) {
      throw new AssertionError("exception");
    }
    o.toString();
    return o;
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void synchronizedOk(Object o) {
    synchronized (o) {
    }
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  // this is to test that we don't crash due to the slightly odd translation of synchronized
  void callSynchronizedOk(Object o) {
    synchronizedOk(o);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
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
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void FP_loopInvariantOk() {
    Object src = InferTaint.inferSecretSource();
    for (int i = 0; i < 10; i++) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  private int getUnreachableCondition() {
    return 0; // This ensures the switch is unreachable
  }
}