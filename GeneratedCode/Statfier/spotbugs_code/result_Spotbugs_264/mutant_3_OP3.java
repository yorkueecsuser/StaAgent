class DoubleIndirectCase1 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in indirect1.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in indirect2.");
    }
  }

  DoubleIndirectCase1() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in constructor.");
    }
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    other.indirect1();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in copy constructor.");
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
      // Unreachable code
      System.out.println("This is an unreachable if statement in clone method.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in staticMethod.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}