class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String bad2 = new String(new char[0]); // DLS NOT found

    // Mutant 1: Unreachable if statement
    boolean condition1 = getCondition();
    if (condition1) {
      // Unreachable code
      System.out.println("This is an unreachable if statement mutant 1.");
    }

    // Mutant 2: Unreachable if statement
    boolean condition2 = getAnotherCondition();
    if (condition2) {
      // Unreachable code
      System.out.println("This is an unreachable if statement mutant 2.");
    }
  }

  private boolean getCondition() {
    return false;
  }

  private boolean getAnotherCondition() {
    return false;
  }
}