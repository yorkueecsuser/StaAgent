class DirectCaseObject implements Cloneable {
  DirectCaseObject() {
    overridableMethod();
    privateMethod();
    finalMethod();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
    }
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    DirectCaseObject omc = (DirectCaseObject) super.clone();
    omc.overridableMethod();
    omc.privateMethod();
    omc.finalMethod();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code in clone.");
    } else {
      System.out.println("This is unreachable code in clone.");
    }
    return omc;
  }

  void overridableMethod() {
    System.out.println("I am overridable.");
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code in overridableMethod.");
    } else {
      System.out.println("This is unreachable code in overridableMethod.");
    }
  }

  private void privateMethod() {
    System.out.println("I am private.");
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code in privateMethod.");
    } else {
      System.out.println("This is unreachable code in privateMethod.");
    }
  }

  final void finalMethod() {
    System.out.println("I am final.");
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code in finalMethod.");
    } else {
      System.out.println("This is unreachable code in finalMethod.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the else part is technically unreachable, but the condition is not a compile-time constant
  }
}