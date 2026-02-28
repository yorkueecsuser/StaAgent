public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    // Introduced an unreachable if statement with a dynamic condition
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      f = 42;
    }
    return f == foo.f;
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}