class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never run
    } else {
      // Some alternative code that will also never run
    }
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never run
    } else {
      // Some alternative code that will also never run
    }
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never run
    } else {
      // Some alternative code that will also never run
    }
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    while (baz.foo.bar == null)
      ;
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never run
    } else {
      // Some alternative code that will also never run
    }
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never run
    } else {
      // Some alternative code that will also never run
    }
  }

  private static boolean getCondition() {
    return false; // This method returns false, but it is not a compile-time constant
  }
}