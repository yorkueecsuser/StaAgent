class IdentifyCorrectBranchPlease {

  int f(boolean b) {
    Object x = null;
    if (b) {
      x = new Object();
    } else {
      b = true;
    }
    // Unreachable if-else statement mutation
    boolean shouldRun = false;
    if (shouldRun) {
      x = new Object();
    } else {
      b = false;
    }
    return x.hashCode();
  }

  int f(boolean b1, boolean b2) {
    Object x = null;
    if (b1) {
      x = new Object();
    } else {
      b1 = true;
    }
    if (b2) System.out.println("b2 is true");
    // Unreachable if-else statement mutation
    boolean shouldRun = false;
    if (shouldRun) {
      x = new Object();
    } else {
      b2 = false;
    }
    return x.hashCode();
  }
}