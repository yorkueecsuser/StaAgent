class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    if (o == null) r++;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      r += 10; // This branch is logically unreachable
    } else {
      r -= 5;  // This branch is also logically unreachable
    }

    return r;
  }

  // Method to provide a dynamically determined condition
  private boolean getCondition() {
    return false; // This will ensure the branches are unreachable at runtime
  }
}