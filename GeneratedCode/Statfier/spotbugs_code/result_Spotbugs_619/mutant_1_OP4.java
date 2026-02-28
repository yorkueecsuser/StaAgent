class SpinWait {
  boolean flag;

  volatile boolean vflag;

  void waitForTrue() {
    while (flag)
      ;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable if condition is true");
    } else {
      // This block is unreachable because condition is never set to false
      System.out.println("This is unreachable");
    }
  }

  void waitForVolatileTrue() {
    while (vflag)
      ;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable if condition is true");
    } else {
      // This block is unreachable because condition is never set to false
      System.out.println("This is unreachable");
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
      // This block is reachable if condition is true
      System.out.println("This is reachable if condition is true");
    } else {
      // This block is unreachable because condition is never set to false
      System.out.println("This is unreachable");
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
      // This block is reachable if condition is true
      System.out.println("This is reachable if condition is true");
    } else {
      // This block is unreachable because condition is never set to false
      System.out.println("This is unreachable");
    }
  }

  static boolean sflag;

  static void waitForStatic() {
    while (!sflag)
      ;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable if condition is true");
    } else {
      // This block is unreachable because condition is never set to false
      System.out.println("This is unreachable");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // Always returns true to ensure the else block is unreachable
  }
}