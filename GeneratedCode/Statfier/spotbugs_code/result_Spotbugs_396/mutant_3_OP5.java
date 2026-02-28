class NullPointerLattice {

  int f(Object o, boolean b) {
    int r = 42;
    if (b) r = o.hashCode();
    else o = new Object();
    
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        r += 10; // This case is unreachable because condition is never true
        break;
      case 1:
        // This case is always taken
        break;
    }

    if (o == null) r++;
    return r;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}