class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    if (x == null) return 0;
    
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      h = h + 1;
    } else {
      // This block is also unreachable because the if block is unreachable
      h = h - 1;
    }
    
    return h;
  }

  // Method to provide a dynamic condition that will never be true
  private static boolean getCondition() {
    return false;
  }
}