class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    boolean condition = getUnreachableCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is always false
        break;
      default:
        // Default case
        break;
    }
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    boolean condition = getUnreachableCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is always false
        break;
      default:
        // Default case
        break;
    }
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
    boolean condition = getUnreachableCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is always false
        break;
      default:
        // Default case
        break;
    }
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    while (baz.foo.bar == null)
      ;
    boolean condition = getUnreachableCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is always false
        break;
      default:
        // Default case
        break;
    }
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    boolean condition = getUnreachableCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is always false
        break;
      default:
        // Default case
        break;
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}