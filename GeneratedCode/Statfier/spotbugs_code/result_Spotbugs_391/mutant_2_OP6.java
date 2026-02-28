class Bug2821733 {

  protected static final int objectCompLowPriority(Comparable c1, Comparable c2) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    
    if (c1 == c2) {
      return 0;
    } else if (c1 == null && c2!= null) {
      return -1;
    } else if (c1!= null && c2 == null) {
      return 1;
    } else {
      return c1.compareTo(c2);
    }
  }

  protected static final int objectCompFalsePositive(Comparable c1, Comparable c2) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    
    if (c1 == c2) {
      return 0;
    } else if (c1 == null) {
      return -1;
    } else if (c2 == null) {
      return 1;
    } else {
      return c1.compareTo(c2);
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}