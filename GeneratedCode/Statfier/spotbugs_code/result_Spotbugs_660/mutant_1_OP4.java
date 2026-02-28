class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {

    int y = x;
    y = y - x;
    
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      y = y + 1; // This line will never be executed
    } else {
      y = y - 1; // This line will also never be executed
    }
    
    return y;
  }

  int a, b;

  public int testSelfOperationField(int x) {

    a = x;
    b = a;
    b = b - a;
    
    // Mutant: Inserting unreachable if-else statement
    boolean shouldRunField = getConditionField();
    if (shouldRunField) {
      a = a + 1; // This line will never be executed
    } else {
      b = b - 1; // This line will also never be executed
    }
    
    return b;
  }

  // Helper methods to provide dynamic conditions
  private boolean getCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }

  private boolean getConditionField() {
    return false; // This method always returns false, making the if-else block unreachable
  }
}