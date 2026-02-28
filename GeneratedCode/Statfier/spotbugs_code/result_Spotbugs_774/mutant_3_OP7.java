class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String bad2 = new String(new char[0]); // DLS NOT found

    // Mutant 1: Unreachable while loop
    boolean conditionWhile1 = getCondition();
    while (conditionWhile1) {
      // Unreachable code
      System.out.println("This is an unreachable loop 1");
    }

    // Mutant 2: Another unreachable while loop
    boolean conditionWhile2 = getAnotherCondition();
    while (conditionWhile2) {
      // Unreachable code
      System.out.println("This is an unreachable loop 2");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }

  // Another method to provide a different dynamic condition
  private boolean getAnotherCondition() {
    return false;
  }
}