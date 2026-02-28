class DoubleIndirectCase1 implements Cloneable {
  final void indirect1() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in indirect1.");
    }
    finalMethod();
    indirect2();
    privateMethod();
  }

  final void indirect2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in indirect2.");
    }
    indirect1();
    overridableMethod();
  }

  DoubleIndirectCase1() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in the constructor.");
    }
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in the copy constructor.");
    }
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase1 clone() throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in the clone method.");
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
      System.out.println("This is an unreachable while loop in overridableMethod.");
    }
    System.out.println("I am overridable.");
  }

  private void privateMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in privateMethod.");
    }
    System.out.println("I am private.");
  }

  final void finalMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in finalMethod.");
    }
    System.out.println("I am final.");
  }

  private static void staticMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in staticMethod.");
    }
    System.out.println("I am static.");
  }

  private boolean getCondition() {
    return false;
  }
}