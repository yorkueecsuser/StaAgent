class PreferZeroLengthArrays {

  public int[] foo(int i) {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is never true
        System.out.println("This is an unreachable case in foo");
        break;
    }
    return null;
  }

  public int[] bar(int i) {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is never true
        System.out.println("This is an unreachable case in bar");
        break;
    }
    return new int[0];
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}