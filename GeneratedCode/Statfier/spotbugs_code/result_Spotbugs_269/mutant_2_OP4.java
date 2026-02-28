class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable.");
    } else {
      System.out.println("This is unreachable.");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the else block is effectively unreachable
  }
}