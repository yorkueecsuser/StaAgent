class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is another unreachable block");
    }
    
    return 42;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}