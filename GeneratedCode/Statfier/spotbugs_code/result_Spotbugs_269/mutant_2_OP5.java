class DoubleIndirectCase6 implements Cloneable {
  DoubleIndirectCase6() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  DoubleIndirectCase6(DoubleIndirectCase6 other) {
    other.indirect1();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  @Override
  public DoubleIndirectCase6 clone() throws CloneNotSupportedException {
    DoubleIndirectCase6 omc = (DoubleIndirectCase6) super.clone();
    omc.indirect1();
    omc.privateMethod();
    omc.finalMethod();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
    return omc;
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}