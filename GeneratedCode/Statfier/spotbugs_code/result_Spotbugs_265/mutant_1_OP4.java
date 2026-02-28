class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block.");
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in indirect1.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in indirect1.");
    }
  }

  DoubleIndirectCase2() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in constructor.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in constructor.");
    }
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    other.indirect1();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in copy constructor.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in copy constructor.");
    }
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 omc = (DoubleIndirectCase2) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in clone method.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in clone method.");
    }
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in overridableMethod.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in privateMethod.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in finalMethod.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in finalMethod.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block in staticMethod.");
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable block in staticMethod.");
    }
  }

  private static boolean getCondition() {
    return false; // This ensures the else block is logically unreachable
  }
}