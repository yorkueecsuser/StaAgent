class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in constructor.");
    }
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in clone method.");
    }
    return omc;
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

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}