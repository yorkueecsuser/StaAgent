class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    if (x == null) return 0;
    
    // Mutant code: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      h = h + 1;
    }
    
    return h;
  }

  private static boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}