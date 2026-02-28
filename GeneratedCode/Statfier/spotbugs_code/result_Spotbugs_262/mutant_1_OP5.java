class DirectCase implements Cloneable {
  DirectCase() {
    overridableMethod();
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

  DirectCase(DirectCase other) {
    other.overridableMethod();
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("This is unreachable.");
        break;
    }
  }

  @Override
  public DirectCase clone() throws CloneNotSupportedException {
    DirectCase omc = (DirectCase) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    return omc;
    
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

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}