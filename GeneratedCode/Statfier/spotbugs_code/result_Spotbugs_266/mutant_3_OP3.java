class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in indirect1.");
    }
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in the constructor.");
    }
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in the copy constructor.");
    }
  }

  @Override
  public DoubleIndirectCase3 clone() throws CloneNotSupportedException {
    DoubleIndirectCase3 omc = (DoubleIndirectCase3) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in the clone method.");
    }
    return omc;
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement in indirect2.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
  }

  private void privateMethod() {
    System.out.println("I am private.");
  }

  final void finalMethod() {
    System.out.println("I am final.");
  }

  private static void staticMethod() {
    System.out.println("I am static.");
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}