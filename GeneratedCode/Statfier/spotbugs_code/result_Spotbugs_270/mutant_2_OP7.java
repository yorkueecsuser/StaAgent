class IndirectCase1 implements Cloneable {
  final void indirect() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    overridableMethod();
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
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
    boolean conditionWhile = getConditionStatic();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }

  private static boolean getConditionStatic() {
    return false;
  }
}