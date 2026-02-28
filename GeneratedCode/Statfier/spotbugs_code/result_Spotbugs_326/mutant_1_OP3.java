public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() will never return true
      System.out.println("This is an unreachable statement.");
    }
    return f == foo.f;
  }

  private boolean getCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
  }
}