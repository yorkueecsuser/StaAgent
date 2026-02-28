class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Mutant: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
    // Mutant: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  @Override
  public DoubleIndirectCase5 clone() throws CloneNotSupportedException {
    DoubleIndirectCase5 omc = (DoubleIndirectCase5) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Mutant: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Mutant: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Mutant: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Mutant: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Mutant: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Mutant: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Mutant: Adding unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  // Helper method to simulate dynamic condition
  private static boolean getCondition() {
    return false; // This will ensure the else block is technically unreachable, but the condition is not a compile-time constant
  }
}