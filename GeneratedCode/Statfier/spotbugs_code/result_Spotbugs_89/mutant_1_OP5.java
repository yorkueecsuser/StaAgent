class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case is unreachable because alwaysFalse is always false
        x = 42;
        break;
      default:
        // Default case is also unreachable due to the same reason
        x = 24;
        break;
    }
    
    return x;
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}