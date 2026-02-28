class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    if (x == null) return 0;
    
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case will never be executed because condition is always false
        h = h + 1;
        break;
      case 0:
        // This case will always be executed
        h = h * 2;
        break;
    }
    
    return h;
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}