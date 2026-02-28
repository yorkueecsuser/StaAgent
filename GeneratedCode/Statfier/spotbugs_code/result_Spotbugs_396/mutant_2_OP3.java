class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    if (o == null) r++;

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      r = r + 10; // This line is logically unreachable due to the nature of getCondition()
    }

    return r;
  }

  // Method to provide a dynamically determined condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}