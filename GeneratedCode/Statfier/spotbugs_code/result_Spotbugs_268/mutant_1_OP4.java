class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
  }

  @Override
  public DoubleIndirectCase5 clone() throws CloneNotSupportedException {
    DoubleIndirectCase5 omc = (DoubleIndirectCase5) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
    return omc;
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean condition = getCondition();
    if (condition) {
      // This is a reachable block
      System.out.println("This is a reachable block.");
    } else {
      // This is an unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}