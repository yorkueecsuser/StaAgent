class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is not defined to return true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is not defined to return true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is not defined to return true
        System.out.println("This is an unreachable case.");
        break;
    }
    return omc;
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is not defined to return true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is not defined to return true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is not defined to return true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is not defined to return true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is not defined to return true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because getCondition() is not defined to return true
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This method is designed to always return false
  }
}