class UseCheckUse {
  final Object x;

  UseCheckUse(Object x) {
    this.x = x;
  }

  int f(boolean b) {
    int result = x.hashCode();
    if (x == null) {
      System.out.println("x is null");
    }
    if (b) result *= x.hashCode();
    else result += x.hashCode();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        result -= x.hashCode();
        break;
      case 1:
        // This case will always be executed
        result += x.hashCode();
        break;
    }

    return result;
  }

  private boolean getCondition() {
    // Always returns false to ensure the switch statement is unreachable
    return false;
  }
}