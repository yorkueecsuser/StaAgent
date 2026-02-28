class DoomedNullDereference {

  public void notDoomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    System.out.println(o.hashCode());
  }

  public void doomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    System.out.println(o.hashCode());
    throw new RuntimeException();
  }

  int doomed2(Object x) {
    if (x == null) System.out.println("null");
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    int result = x.hashCode();
    throw new RuntimeException("F" + result);
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}