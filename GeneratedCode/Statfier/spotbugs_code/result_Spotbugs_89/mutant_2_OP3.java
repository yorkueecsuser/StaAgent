class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      x = 5;
    }
    
    return x;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}