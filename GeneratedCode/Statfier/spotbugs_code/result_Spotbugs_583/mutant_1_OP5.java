class IgnoreBranchesWhereValueIsKnownNonNull {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x!= null && b) return 0;
    
    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
    
    return x.hashCode();
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}