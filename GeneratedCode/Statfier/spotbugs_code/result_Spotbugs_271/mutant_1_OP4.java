class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  final void indirect() {
    overridableMethod();
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // This ensures the if branch is taken, making the else branch unreachable
  }
}