class UnreadFields {
  int x = 1;

  public boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      x = 2;
    }
  }
}