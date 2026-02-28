class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    
    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      r = r + 10; // This line is unreachable
    }
    
    if (o == null) r++;
    return r;
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}