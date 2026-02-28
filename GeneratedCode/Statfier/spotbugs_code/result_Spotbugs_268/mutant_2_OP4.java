class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This block is unreachable.");
    }
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This block is unreachable.");
    }
  }

  @Override
  public DoubleIndirectCase5 clone() throws CloneNotSupportedException {
    DoubleIndirectCase5 omc = (DoubleIndirectCase5) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This block is unreachable.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This block is unreachable.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This block is unreachable.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This block is unreachable.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This block is unreachable.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This block is unreachable.");
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}