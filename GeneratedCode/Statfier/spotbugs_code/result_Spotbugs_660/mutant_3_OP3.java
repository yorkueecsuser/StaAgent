class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {

    int y = x;
    y = y - x;
    
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      y = y + 1; // This line is unreachable because condition is always false
    }
    
    return y;
  }

  int a, b;

  public int testSelfOperationField(int x) {

    a = x;
    b = a;
    b = b - a;
    
    // Mutant: Adding an unreachable if statement
    boolean conditionField = getConditionField();
    if (conditionField) {
      b = b + 1; // This line is unreachable because conditionField is always false
    }
    
    return b;
  }

  // Method to provide a dynamically determined condition
  private boolean getCondition() {
    return false;
  }

  // Another method to provide a dynamically determined condition
  private boolean getConditionField() {
    return false;
  }
}