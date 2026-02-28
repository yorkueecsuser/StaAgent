class PreferZeroLengthArrays {

  public int[] foo(int i) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case in foo");
        break;
    }
    return null;
  }

  public int[] bar(int i) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case in bar");
        break;
    }
    return new int[0];
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}