import codetoanalyze.java.InferTaint;

/** testing basic intraprocedural functionality: assignment, ifs, loops, casts */
class Basics {

  native Object notASource();

  native void notASink(Object o);

  /** should report on these tests */
  void directBad() {
    InferTaint.inferSensitiveSink(InferTaint.inferSecretSource());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void viaVarBad1() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void viaVarBad2() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    InferTaint.inferSensitiveSink(alias);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void viaVarBad3() {
    Object src = InferTaint.inferSecretSource();
    Object alias = src;
    src = null;
    InferTaint.inferSensitiveSink(alias);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void viaCastBad1() {
    InferTaint.inferSensitiveSink((String) InferTaint.inferSecretSource());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void viaCastBad2() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink((String) src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void ifBad1(boolean b) {
    Object src = null;
    if (b) {
      src = InferTaint.inferSecretSource();
    }
    InferTaint.inferSensitiveSink(src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void ifBad2(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void ifBad5(boolean b) {
    Object src = InferTaint.inferSecretSource();
    if (b) {
      InferTaint.inferSensitiveSink(src);
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void whileBad1(int i) {
    Object src = InferTaint.inferSecretSource();
    while (i < 10) {
      InferTaint.inferSensitiveSink(src);
      i++;
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void whileBad2(int i) {
    Object src = null;
    while (i < 10) {
      src = InferTaint.inferSecretSource();
      i++;
    }
    InferTaint.inferSensitiveSink(src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  // this should report only two alarms, not three
  void noTripleReportBad() {
    Object src = InferTaint.inferSecretSource();
    InferTaint.inferSensitiveSink(src);
    InferTaint.inferSensitiveSink(src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void arrayWithTaintedContentsBad() {
    Object src = InferTaint.inferSecretSource();
    Object[] arr = new Object[] {src};
    InferTaint.inferSensitiveSink(arr);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void funCallBad1() {
    Object src = InferTaint.inferSecretSource();
    funCallBad2(2, src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void funCallBad2(int x, Object src) {
    InferTaint.inferSensitiveSink(src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  /** should not report on these tests */
  void directOk1() {
    notASink(notASource());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void directOk2() {
    notASink(InferTaint.inferSecretSource());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void directOk3() {
    InferTaint.inferSensitiveSink(notASource());
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void viaVarOk() {
    Object src = new Object();
    InferTaint.inferSensitiveSink(src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void viaVarStrongUpdateOk() {
    Object src = InferTaint.inferSecretSource();
    src = null;
    InferTaint.inferSensitiveSink(src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  Object exceptionOk(boolean b, Object o) {
    if (b) {
      throw new AssertionError("exception");
    }
    o.toString();
    return o;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void synchronizedOk(Object o) {
    synchronized (o) {
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  // this is to test that we don't crash due to the slightly odd translation of synchronized
  void callSynchronizedOk(Object o) {
    synchronizedOk(o);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  void FP_loopInvariantOk() {
    Object src = InferTaint.inferSecretSource();
    for (int i = 0; i < 10; i++) {
      src = null;
    }
    InferTaint.inferSensitiveSink(src);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}