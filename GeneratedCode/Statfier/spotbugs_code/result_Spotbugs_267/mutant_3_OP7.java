class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  DoubleIndirectCase4() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    other.indirect1();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    DoubleIndirectCase4 omc = (DoubleIndirectCase4) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}