class Bug2821733 {

  protected static final int objectCompLowPriority(Comparable c1, Comparable c2) {
    if (c1 == c2) {
      return 0;
    } else if (c1 == null && c2!= null) {
      return -1;
    } else if (c1!= null && c2 == null) {
      return 1;
    } else {
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition? 0 : 1 will always be 1
          return -999;
        case 1:
          // This is the only reachable case
          return c1.compareTo(c2);
      }
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
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition? 0 : 1 will always be 1
          return -999;
        case 1:
          // This is the only reachable case
          return c1.compareTo(c2);
      }
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method can be modified to return different values at runtime if needed
  }
}