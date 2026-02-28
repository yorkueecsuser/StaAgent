class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    
    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case is unreachable because alwaysFalse is never set to true
        x = 42;
        break;
    }
    
    return x;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch is unreachable
    return false;
  }
}