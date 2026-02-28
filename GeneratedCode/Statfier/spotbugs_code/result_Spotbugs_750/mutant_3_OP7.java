class UselessControlFlow {

  void harmless1(Object x, Object y) {
    if (!x.equals(y)) {

    } else {

    }
    System.out.println(x);
    System.out.println(y);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void report0(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void report1(Object x, Object y) {
    if (!x.equals(y))
      ;
    System.out.println(x);
    System.out.println(y);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void report2(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void report3(Object x, Object y) {
    if (!x.equals(y))
      ;

    System.out.println(x);
    System.out.println(y);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void report4(Object[] x, Object y) {
    for (Object o : x) {
      if (o.equals(y)) {}
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}