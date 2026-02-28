class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String bad2 = new String(new char[0]); // DLS NOT found

    // Mutant 1: Inserting an unreachable if statement
    boolean condition1 = getCondition();
    if (condition1) {
      System.out.println("This is an unreachable statement due to condition1 being false.");
    }

    // Mutant 2: Inserting another unreachable if statement
    boolean condition2 = getAnotherCondition();
    if (condition2) {
      System.out.println("This is another unreachable statement due to condition2 being false.");
    }
  }

  // Method to provide a dynamically determined condition
  private boolean getCondition() {
    return false;
  }

  // Another method to provide a dynamically determined condition
  private boolean getAnotherCondition() {
    return false;
  }
}