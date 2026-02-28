class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable.");
    }
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable.");
    }
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable.");
    }
  }

  @Override
  public DoubleIndirectCase3 clone() throws CloneNotSupportedException {
    DoubleIndirectCase3 omc = (DoubleIndirectCase3) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable.");
    }
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
    return false; // This method ensures the condition is always false, making the else block unreachable
  }
}