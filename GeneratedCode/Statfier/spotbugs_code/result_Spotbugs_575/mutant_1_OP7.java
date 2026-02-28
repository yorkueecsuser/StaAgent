class DoomedNullDereference {

  public void notDoomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    System.out.println(o.hashCode());
  }

  public void doomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    System.out.println(o.hashCode());
    throw new RuntimeException();
  }

  int doomed2(Object x) {
    if (x == null) System.out.println("null");
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is unreachable");
    }
    int result = x.hashCode();
    throw new RuntimeException("F" + result);
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false;
  }
}