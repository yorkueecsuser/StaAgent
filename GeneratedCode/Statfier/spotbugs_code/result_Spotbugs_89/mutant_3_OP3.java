class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    
    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = 5; // This line is unreachable because getCondition() will always return false
    }
    
    return x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if block unreachable
  }
}