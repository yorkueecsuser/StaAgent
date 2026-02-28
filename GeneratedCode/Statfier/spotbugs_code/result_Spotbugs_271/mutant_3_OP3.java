class IndirectCase2 implements Cloneable {
  IndirectCase2() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in the constructor.");
    }
  }

  IndirectCase2(IndirectCase2 other) {
    other.indirect();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in the copy constructor.");
    }
  }

  @Override
  public IndirectCase2 clone() throws CloneNotSupportedException {
    IndirectCase2 omc = (IndirectCase2) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in the clone method.");
    }
    return omc;
  }

  final void indirect() {
    overridableMethod();
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in the indirect method.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in the overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in the privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in the finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement in the staticMethod.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}