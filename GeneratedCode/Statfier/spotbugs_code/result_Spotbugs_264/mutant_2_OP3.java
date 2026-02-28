class DoubleIndirectCase1 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }

  DoubleIndirectCase1() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Yet another unreachable statement.");
    }
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    other.indirect1();
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable statement in constructor.");
    }
  }

  @Override
  public DoubleIndirectCase1 clone() throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable statement in clone method.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable statement in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable statement in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable statement in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable statement in staticMethod.");
    }
  }

  // Method to provide a dynamic condition for the if statements
  private boolean getCondition() {
    return false;
  }
}