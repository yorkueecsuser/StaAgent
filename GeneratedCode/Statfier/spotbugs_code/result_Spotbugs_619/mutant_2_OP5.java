class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is always false
        break;
    }
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is always false
        break;
    }
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is always false
        break;
    }
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    while (baz.foo.bar == null)
      ;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is always false
        break;
    }
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is always false
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}