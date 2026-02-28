class StringEqualityTest {

  boolean almostEmpty(String s) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }

    return s.trim() == "";
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the loop remains unreachable
  }
}