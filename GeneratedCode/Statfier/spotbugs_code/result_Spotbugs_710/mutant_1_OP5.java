class Bug1564367 {
  void f(Object x, Object y) {
    if (y == null) x = y;
    else System.out.println(x);

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      case 1:
        // This case is always executed
        System.out.println("This is the reachable case");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }
}