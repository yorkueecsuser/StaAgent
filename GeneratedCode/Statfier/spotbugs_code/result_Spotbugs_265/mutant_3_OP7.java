class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    indirect1();
    overridableMethod();
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
  }

  DoubleIndirectCase2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 omc = (DoubleIndirectCase2) super.clone();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  void overridableMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println("I am overridable.");
  }

  private void privateMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println("I am private.");
  }

  final void finalMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println("I am final.");
  }

  private static void staticMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println("I am static.");
  }

  private boolean getCondition() {
    return false;
  }
}