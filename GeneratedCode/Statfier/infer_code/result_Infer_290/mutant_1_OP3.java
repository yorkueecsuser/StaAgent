class T {
  int x;

  void f() {
    // Original code remains intact

    // Added mutant code
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }
}