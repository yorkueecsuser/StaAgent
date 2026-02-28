class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in constructor.");
    }
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in copy constructor.");
    }
  }

  @Override
  public DoubleIndirectCase3 clone() throws CloneNotSupportedException {
    DoubleIndirectCase3 omc = (DoubleIndirectCase3) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in clone method.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in indirect2.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in staticMethod.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}