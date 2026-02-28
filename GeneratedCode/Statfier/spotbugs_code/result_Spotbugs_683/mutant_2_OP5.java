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
        // This case is unreachable because condition is always false
        result = result + 100;
        break;
      case 1:
        // This is the only reachable case
        result = result + 200;
        break;
    }

    return result;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}