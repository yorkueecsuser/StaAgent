class Bug1941450 {
  void method() {
    String good = new String(new char[0]); // DLS found
    String bad = new String(new char[0]); // DLS NOT found
    String good2 = new String(new char[0]); // DLS found
    String bad2 = new String(new char[0]); // DLS NOT found

    // Mutant code for Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This block is always reachable");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}