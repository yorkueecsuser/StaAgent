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
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
      result -= 1; // Unique operation to ensure the mutant is unique
    }
    if (b) result *= x.hashCode();
    else result += x.hashCode();
    return result;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the loop unreachable
  }
}