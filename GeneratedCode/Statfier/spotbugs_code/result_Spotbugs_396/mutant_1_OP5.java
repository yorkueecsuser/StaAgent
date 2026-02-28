class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        r += 10; // This code is unreachable
        break;
      default:
        // Do nothing
        break;
    }

    if (o == null) r++;
    return r;
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}