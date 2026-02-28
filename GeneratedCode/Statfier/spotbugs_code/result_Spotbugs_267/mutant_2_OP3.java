class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  DoubleIndirectCase4() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    other.indirect1();
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    DoubleIndirectCase4 omc = (DoubleIndirectCase4) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if statement unreachable
  }
}