class Bug1564367 {
  void f(Object x, Object y) {
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }

    if (y == null) x = y;
    else System.out.println(x);
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}