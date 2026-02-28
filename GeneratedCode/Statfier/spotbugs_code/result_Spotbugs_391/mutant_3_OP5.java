class Bug2821733 {

  protected static final int objectCompLowPriority(Comparable c1, Comparable c2) {
    if (c1 == c2) {
      return 0;
    } else if (c1 == null && c2!= null) {
      return -1;
    } else if (c1!= null && c2 == null) {
      return 1;
    } else {
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          return -999;
        default:
          // Default case is also unreachable because condition is always false
          return 999;
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
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          return -999;
        default:
          // Default case is also unreachable because condition is always false
          return 999;
      }
      return c1.compareTo(c2);
    }
  }

  private static boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}