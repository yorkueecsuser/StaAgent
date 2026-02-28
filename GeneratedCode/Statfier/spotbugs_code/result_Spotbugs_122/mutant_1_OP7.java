class Bar {
  static Class other;

  static {
    other = Foo.other;

    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the while loop is unreachable
    return false;
  }
}