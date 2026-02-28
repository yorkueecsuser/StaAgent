class PreferZeroLengthArrays {

  public int[] foo(int i) {
    boolean condition = getCondition();
    switch (i) {
      case 0:
        // Some code here
        break;
      default:
        // Some default code here
        break;
    }
    // Unreachable switch statement
    int value = getValue();
    switch (value) {
      case 1:
        // This case will never be reached because getValue() does not return 1
        System.out.println("This is unreachable");
        break;
    }
    return null;
  }

  public int[] bar(int i) {
    boolean condition = getCondition();
    switch (i) {
      case 0:
        // Some code here
        break;
      default:
        // Some default code here
        break;
    }
    // Unreachable switch statement
    int value = getValue();
    switch (value) {
      case 1:
        // This case will never be reached because getValue() does not return 1
        System.out.println("This is unreachable");
        break;
    }
    return new int[0];
  }

  private boolean getCondition() {
    // This method can return true or false dynamically
    return false;
  }

  private int getValue() {
    // This method can return any integer dynamically
    return 0;
  }
}