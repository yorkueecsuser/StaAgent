class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case
        break;
    }

    return 42;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}