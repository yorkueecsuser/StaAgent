class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch.");
    }
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in constructor.");
    }
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in copy constructor.");
    }
  }

  @Override
  public IndirectCase1 clone() throws CloneNotSupportedException {
    IndirectCase1 omc = (IndirectCase1) super.clone();
    omc.indirect();
    omc.privateMethod();
    omc.finalMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in clone method.");
    }
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in staticMethod.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}