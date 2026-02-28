class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    
    // Inserting an unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
    
    return 42;
  }

  private boolean getConditionForLoop() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}