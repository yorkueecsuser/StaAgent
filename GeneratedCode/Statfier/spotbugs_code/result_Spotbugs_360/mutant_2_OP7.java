class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    
    // Introduced an unreachable while loop as per the mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
    
    return 42;
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}