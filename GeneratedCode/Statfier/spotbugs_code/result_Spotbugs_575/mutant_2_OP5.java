class DoomedNullDereference {

  public void notDoomed(boolean b) {
    Object o = null;
    if (b) {
      o = new Object();
    }
    System.out.println(o.hashCode());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("Unreachable case 0");
        break;
      case 1:
        System.out.println("Unreachable case 1");
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
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("Unreachable case 0");
        break;
      case 1:
        System.out.println("Unreachable case 1");
        break;
    }
  }

  int doomed2(Object x) {
    if (x == null) System.out.println("null");
    int result = x.hashCode();
    throw new RuntimeException("F" + result);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("Unreachable case 0");
        break;
      case 1:
        System.out.println("Unreachable case 1");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}