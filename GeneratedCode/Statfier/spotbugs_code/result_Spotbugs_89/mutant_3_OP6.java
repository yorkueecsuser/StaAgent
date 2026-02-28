class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }
    
    return x;
  }

  private boolean getCondition() {
    // This method returns false, ensuring the loop is unreachable
    return false;
  }
}