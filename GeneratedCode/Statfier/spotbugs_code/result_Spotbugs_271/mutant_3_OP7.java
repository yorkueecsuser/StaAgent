class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
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