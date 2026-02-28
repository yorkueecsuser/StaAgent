class T {
  int x;

  void f() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}