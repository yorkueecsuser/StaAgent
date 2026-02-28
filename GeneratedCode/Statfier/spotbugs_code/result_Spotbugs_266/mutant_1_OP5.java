class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
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
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
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
    return false; // This method ensures the condition is always false
  }
}