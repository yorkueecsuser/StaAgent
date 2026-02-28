class IndirectCase1 implements Cloneable {
  final void indirect() {
    overridableMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This is reachable code.");
    } else {
      // This is the unreachable if-else branch
      System.out.println("This is unreachable code.");
    }
  }

  IndirectCase1() {
    indirect();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This is reachable code in constructor.");
    } else {
      // This is the unreachable if-else branch
      System.out.println("This is unreachable code in constructor.");
    }
  }

  IndirectCase1(IndirectCase1 other) {
    other.indirect();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This is reachable code in copy constructor.");
    } else {
      // This is the unreachable if-else branch
      System.out.println("This is unreachable code in copy constructor.");
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
      // Some code that will run if shouldRun is true
      System.out.println("This is reachable code in clone method.");
    } else {
      // This is the unreachable if-else branch
      System.out.println("This is unreachable code in clone method.");
    }
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This is reachable code in overridableMethod.");
    } else {
      // This is the unreachable if-else branch
      System.out.println("This is unreachable code in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This is reachable code in privateMethod.");
    } else {
      // This is the unreachable if-else branch
      System.out.println("This is unreachable code in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This is reachable code in finalMethod.");
    } else {
      // This is the unreachable if-else branch
      System.out.println("This is unreachable code in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This is reachable code in staticMethod.");
    } else {
      // This is the unreachable if-else branch
      System.out.println("This is unreachable code in staticMethod.");
    }
  }

  private boolean getCondition() {
    return false; // This ensures the else branch is theoretically unreachable
  }
}