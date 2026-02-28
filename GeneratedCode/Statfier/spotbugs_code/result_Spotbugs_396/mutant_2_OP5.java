class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    
    // Introduced unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        r += 10; // This case is unreachable
        break;
      default:
        r -= 5; // This case is also unreachable
        break;
    }

    if (o == null) r++;
    return r;
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}