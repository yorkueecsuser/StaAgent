class NeedsToCheckReturnValue {

  int bar(NeedsReturnValueChecked n) {
    n.foo();
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This is always printed");
        break;
    }
    
    return 42;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }
}