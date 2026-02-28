class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }

    if (x == null) return 0;
    return h;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, making the while loop unreachable
  }
}