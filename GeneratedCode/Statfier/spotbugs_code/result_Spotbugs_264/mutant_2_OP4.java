class DoubleIndirectCase1 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will never execute either due to the same reason
      System.out.println("This is an unreachable else block.");
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
  }

  DoubleIndirectCase1() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block in constructor.");
    } else {
      // This block will never execute either due to the same reason
      System.out.println("This is an unreachable else block in constructor.");
    }
  }

  DoubleIndirectCase1(DoubleIndirectCase1 other) {
    other.indirect1();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block in copy constructor.");
    } else {
      // This block will never execute either due to the same reason
      System.out.println("This is an unreachable else block in copy constructor.");
    }
  }

  @Override
  public DoubleIndirectCase1 clone() throws CloneNotSupportedException {
    DoubleIndirectCase1 omc = (DoubleIndirectCase1) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
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
    return false;
  }
}