class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is unreachable code.");
    } else {
      // This block also will never execute because the if condition is always false
      System.out.println("This is also unreachable code.");
    }
    
    return 42;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}