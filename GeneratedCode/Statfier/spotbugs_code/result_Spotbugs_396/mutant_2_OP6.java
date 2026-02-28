class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      r += i;
    }

    if (o == null) r++;
    return r;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}