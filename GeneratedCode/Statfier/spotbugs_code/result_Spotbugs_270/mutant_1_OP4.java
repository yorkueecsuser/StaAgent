class IndirectCase1 implements Cloneable {
  final void indirect() {
    boolean condition = getCondition();
    if (condition) {
      overridableMethod();
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block.");
    }
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block in constructor.");
    }
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block in copy constructor.");
    }
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      // Unreachable if-else statement
      System.out.println("This is an unreachable else block in clone method.");
    }
    return omc;
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
    return true; // This ensures the condition is always true, making the else block unreachable
  }
}