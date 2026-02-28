class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is a reachable statement.");
    } else {
      System.out.println("This is an unreachable statement due to the condition.");
    }
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is a reachable statement.");
    } else {
      System.out.println("This is an unreachable statement due to the condition.");
    }
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is a reachable statement.");
    } else {
      System.out.println("This is an unreachable statement due to the condition.");
    }
  }

  final void indirect() {
    overridableMethod();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is a reachable statement.");
    } else {
      System.out.println("This is an unreachable statement due to the condition.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is a reachable statement.");
    } else {
      System.out.println("This is an unreachable statement due to the condition.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is a reachable statement.");
    } else {
      System.out.println("This is an unreachable statement due to the condition.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is a reachable statement.");
    } else {
      System.out.println("This is an unreachable statement due to the condition.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is a reachable statement.");
    } else {
      System.out.println("This is an unreachable statement due to the condition.");
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will ensure the else block is technically unreachable, but the condition is not a compile-time constant
  }
}