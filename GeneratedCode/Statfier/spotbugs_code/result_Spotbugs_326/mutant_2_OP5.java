public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    return f == foo.f;
  }

  // Introduced unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // Unreachable code
        System.out.println("This will never be printed");
        break;
      default:
        // Default case
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0;
    }
  }
}