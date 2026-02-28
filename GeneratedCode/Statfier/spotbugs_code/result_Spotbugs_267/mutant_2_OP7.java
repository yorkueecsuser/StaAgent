class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in indirect2.");
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
      System.out.println("This is an unreachable while loop in constructor.");
    }
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    other.indirect1();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in copy constructor.");
    }
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    DoubleIndirectCase4 omc = (DoubleIndirectCase4) super.clone();
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
      // Unreachable code
      System.out.println("This is an unreachable while loop in indirect1.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean conditionWhile = getConditionStatic();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in staticMethod.");
    }
  }

  private boolean getCondition() {
    return false;
  }

  private static boolean getConditionStatic() {
    return false;
  }
}