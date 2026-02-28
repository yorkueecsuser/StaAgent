class DoubleIndirectCase1 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  DoubleIndirectCase1() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    other.indirect1();
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  @Override
  public DoubleIndirectCase1 clone() throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if-else unreachable
  }
}