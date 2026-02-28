class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
    
    return x;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the while loop is unreachable
    return false;
  }
}