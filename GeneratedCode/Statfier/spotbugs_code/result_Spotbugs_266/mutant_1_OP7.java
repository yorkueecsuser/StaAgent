class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop.");
    }
    finalMethod();
    indirect2();
    privateMethod();
  }

  DoubleIndirectCase3() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop.");
    }
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop.");
    }
    other.indirect1();
  }

  @Override
  public DoubleIndirectCase3 clone() throws CloneNotSupportedException {
    DoubleIndirectCase3 omc = (DoubleIndirectCase3) super.clone();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop.");
    }
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop.");
    }
    indirect1();
    overridableMethod();
  }

  void overridableMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop.");
    }
    System.out.println("I am overridable.");
  }

  private void privateMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop.");
    }
    System.out.println("I am private.");
  }

  final void finalMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop.");
    }
    System.out.println("I am final.");
  }

  private static void staticMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop.");
    }
    System.out.println("I am static.");
  }

  private boolean getCondition() {
    return false;
  }
}