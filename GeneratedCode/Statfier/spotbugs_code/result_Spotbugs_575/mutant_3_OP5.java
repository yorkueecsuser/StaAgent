class DoomedNullDereference {

  public void notDoomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    System.out.println(o.hashCode());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("Unreachable case true");
        break;
      case false:
        System.out.println("Unreachable case false");
        break;
    }
  }

  public void doomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    System.out.println(o.hashCode());
    throw new RuntimeException();

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("Unreachable case true");
        break;
      case false:
        System.out.println("Unreachable case false");
        break;
    }
  }

  int doomed2(Object x) {
    if (x == null) System.out.println("null");
    int result = x.hashCode();
    throw new RuntimeException("F" + result);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        System.out.println("Unreachable case true");
        break;
      case false:
        System.out.println("Unreachable case false");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}