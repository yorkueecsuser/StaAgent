class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect() {
    overridableMethod();
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      System.out.println("This is an unreachable while loop.");
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false;
  }
}