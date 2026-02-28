class DoubleIndirectCase4 implements Cloneable {
  final void indirect2() {
    indirect1();
    overridableMethod();
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  DoubleIndirectCase4() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  DoubleIndirectCase4(DoubleIndirectCase4 other) {
    other.indirect1();
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
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
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  final void indirect1() {
    finalMethod();
    indirect2();
    privateMethod();
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable.");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}