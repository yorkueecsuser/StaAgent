class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in constructor.");
    }
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in copy constructor.");
    }
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in clone method.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement in staticMethod.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if statement unreachable.
  }
}