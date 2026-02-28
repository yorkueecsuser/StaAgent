public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because getCondition() always returns false
      f = 42;
    } else {
      // This block will also never be executed because the if condition is always false
      f = 24;
    }
    return f == foo.f;
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}