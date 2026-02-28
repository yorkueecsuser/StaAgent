class Bug1726846 {

  private static final int[] INTS = {1, 2, 3};

  public static final int[] getInts() {
    return INTS;
  }

  private static int theStatic = 0;

  public void bug() {
    // Here is a write to a static field from an instance method
    theStatic = 17;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("This is the reachable case.");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the first case in the switch unreachable
    return false;
  }
}