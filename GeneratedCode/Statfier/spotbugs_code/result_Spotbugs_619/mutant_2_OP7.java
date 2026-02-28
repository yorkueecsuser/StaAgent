class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    while (baz.foo.bar == null)
      ;
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    // Mutant: Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  // Helper method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}