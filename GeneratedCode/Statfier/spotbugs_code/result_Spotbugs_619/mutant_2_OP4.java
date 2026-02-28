class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      flag = false;
    } else {
      // This block will always execute
      flag = true;
    }
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      vflag = false;
    } else {
      // This block will always execute
      vflag = true;
    }
  }

  SpinWait foo;

  SpinWait bar;

  void waitForNonNull() {
    while (foo == null)
      ;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      foo = new SpinWait();
    } else {
      // This block will always execute
      foo = null;
    }
  }

  static void waitForNonNullIndirect(int x, SpinWait baz) {
    while (baz.foo == null)
      ;
    while (baz.foo.bar == null)
      ;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      baz.foo = new SpinWait();
    } else {
      // This block will always execute
      baz.foo = null;
    }
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      sflag = true;
    } else {
      // This block will always execute
      sflag = false;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if-block unreachable
  }
}