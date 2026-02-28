class DoubleIndirectCase5 implements Cloneable {
  DoubleIndirectCase5() {
    indirect1();
    privateMethod();
    finalMethod();
    staticMethod();
    
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  DoubleIndirectCase5(DoubleIndirectCase5 other) {
    other.indirect1();
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
    
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  final void indirect2() {
    indirect1();
    overridableMethod();
    
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private static void staticMethod() {
    System.out.println("I am static.");
    
    // Mutant: Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}