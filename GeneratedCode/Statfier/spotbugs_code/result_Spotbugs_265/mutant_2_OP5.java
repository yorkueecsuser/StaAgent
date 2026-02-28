class DoubleIndirectCase2 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
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
        // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  DoubleIndirectCase2() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  DoubleIndirectCase2(DoubleIndirectCase2 other) {
    other.indirect1();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  @Override
  public DoubleIndirectCase2 clone() throws CloneNotSupportedException {
    DoubleIndirectCase2 omc = (DoubleIndirectCase2) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}