class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  DoubleIndirectCase4() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    other.indirect1();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  @Override
  public DoubleIndirectCase4 clone() throws CloneNotSupportedException {
    DoubleIndirectCase4 omc = (DoubleIndirectCase4) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is false
        System.out.println("This is an unreachable case.");
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
    return false;
  }
}