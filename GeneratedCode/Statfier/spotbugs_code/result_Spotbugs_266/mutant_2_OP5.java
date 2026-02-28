class DoubleIndirectCase3 implements Cloneable {
  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  DoubleIndirectCase3() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  DoubleIndirectCase3(DoubleIndirectCase3 other) {
    other.indirect1();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}