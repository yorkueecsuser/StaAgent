class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
      r--;
    }
    
    if (o == null) r++;
    return r;
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This ensures the loop remains unreachable
  }
}