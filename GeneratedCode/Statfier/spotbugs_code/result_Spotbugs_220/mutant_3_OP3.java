class StringEqualityTest {

  boolean almostEmpty(String s) {
    // Original code
    return s.trim() == "";

    // Mutant code - Unreachable if statement
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