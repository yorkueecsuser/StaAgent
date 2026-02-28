class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    }
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    }
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    }
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    while (baz.foo.bar == null)
      ;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    }
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    }
  }

  private static boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}