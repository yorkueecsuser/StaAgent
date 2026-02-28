class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    
    // Unreachable for loop inserted
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }
    
    return 42;
  }

  private boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}