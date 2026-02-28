class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    if (o == null) r++;

    // Inserting unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      r = r + 10; // This will never be executed
    } else {
      r = r - 5;  // This will also never be executed
    }

    return r;
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}