public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable block");
    } else {
      // This block is always executed
      return f == foo.f;
    }
  }

  private boolean getCondition() {
    // Always return false to ensure the if block is unreachable
    return false;
  }
}