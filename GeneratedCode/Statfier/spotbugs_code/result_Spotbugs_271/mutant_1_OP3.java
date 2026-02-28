class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in the copy constructor.");
    }
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in the clone method.");
    }
  }

  final void indirect() {
    overridableMethod();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in the indirect method.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in the overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in the privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in the finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in the staticMethod.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if blocks unreachable
  }
}