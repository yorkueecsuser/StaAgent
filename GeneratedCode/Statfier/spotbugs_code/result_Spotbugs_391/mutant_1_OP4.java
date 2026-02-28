class Bug2821733 {

  protected static final int objectCompLowPriority(Comparable c1, Comparable c2) {
    if (c1 == c2) {
      return 0;
    } else if (c1 == null && c2!= null) {
      return -1;
    } else if (c1!= null && c2 == null) {
      return 1;
    } else {
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        return 42; // This is an unreachable statement
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
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        return 42; // This is an unreachable statement
      }
      return c1.compareTo(c2);
    }
  }

  private static boolean getUnreachableCondition() {
    return false; // This method always returns false, making the condition effectively unreachable
  }
}