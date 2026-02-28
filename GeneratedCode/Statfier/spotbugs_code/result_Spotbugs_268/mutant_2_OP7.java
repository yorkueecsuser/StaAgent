class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  @Override
  public DoubleIndirectCase5 clone() throws CloneNotSupportedException {
    DoubleIndirectCase5 omc = (DoubleIndirectCase5) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}