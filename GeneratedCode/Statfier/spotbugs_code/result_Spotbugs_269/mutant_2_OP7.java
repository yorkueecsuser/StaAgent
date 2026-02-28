class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable while loop in constructor.");
    }
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable while loop in copy constructor.");
    }
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable while loop in clone method.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable while loop in indirect2 method.");
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable while loop in indirect1 method.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable while loop in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable while loop in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable while loop in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable while loop in staticMethod.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}