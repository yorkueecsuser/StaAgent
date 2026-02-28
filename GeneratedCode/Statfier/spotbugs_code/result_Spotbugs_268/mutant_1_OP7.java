class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @Override
  public DoubleIndirectCase5 clone() throws CloneNotSupportedException {
    DoubleIndirectCase5 omc = (DoubleIndirectCase5) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, ensuring the loops are unreachable
  }
}