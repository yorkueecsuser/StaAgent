class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = 5; // This line is unreachable because condition is always false
    }
    
    return x;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}