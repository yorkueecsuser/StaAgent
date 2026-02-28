class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String bad2 = new String(new char[0]); // DLS NOT found

    // Mutant 1: Unreachable if statement
    boolean condition1 = getCondition();
    if (condition1) {
      // This block is unreachable because getCondition() will return false
      System.out.println("This is an unreachable block 1");
    }

    // Mutant 2: Unreachable if statement
    boolean condition2 = getAnotherCondition();
    if (condition2) {
      // This block is unreachable because getAnotherCondition() will return false
      System.out.println("This is an unreachable block 2");
    }
  }

  // Method to provide a dynamically determined false condition
  private boolean getCondition() {
    return false;
  }

  // Another method to provide a dynamically determined false condition
  private boolean getAnotherCondition() {
    return false;
  }
}