class Bug2821733 {

  protected static final int objectCompLowPriority(Comparable c1, Comparable c2) {
    if (c1 == c2) {
      return 0;
    } else if (c1 == null && c2!= null) {
      return -1;
    } else if (c1!= null && c2 == null) {
      return 1;
    } else {
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
      return c1.compareTo(c2);
    }
  }

  protected static final int objectCompFalsePositive(Comparable c1, Comparable c2) {
    if (c1 == c2) {
      return 0;
    } else if (c1 == null) {
      return -1;
    } else if (c2 == null) {
      return 1;
    } else {
      // Introduced unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
      return c1.compareTo(c2);
    }
  }

  // Method to provide a dynamic condition for the while loop
  private static boolean getCondition() {
    return false; // This will always return false, making the loop unreachable
  }
}