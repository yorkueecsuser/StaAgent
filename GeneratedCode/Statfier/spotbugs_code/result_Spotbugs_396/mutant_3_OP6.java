class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    
    // Introduced an unreachable for loop according to the mutation operator
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
      r += i; // Unique operation within the loop
    }

    if (o == null) r++;
    return r;
  }

  // Method to provide a dynamic condition for the for loop
  private boolean getConditionForLoop() {
    return false; // This ensures the loop is unreachable
  }
}