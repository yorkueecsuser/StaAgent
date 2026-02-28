class Bug1564367 {
  void f(Object x, Object y) {
    boolean condition = getCondition();
    if (y == null) x = y;
    else System.out.println(x);

    // Unreachable switch statement
    switch(getValue()) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }

  private int getValue() {
    return 0; // This method always returns 0, ensuring the switch is unreachable
  }
}