class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {

    int y = x;
    y = y - x;
    
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
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
    
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      a = a + 1; // This line will never be executed
    } else {
      b = b - 1; // This line will also never be executed
    }
    
    return b;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else is unreachable
  }
}