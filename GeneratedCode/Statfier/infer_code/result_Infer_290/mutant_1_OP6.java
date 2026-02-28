class T {
  int x;

  void f() {
    // Original code remains unchanged

    // Mutated code: Adding an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the loop unreachable
  }
}