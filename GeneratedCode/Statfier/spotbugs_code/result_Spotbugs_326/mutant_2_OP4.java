public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code block
      System.out.println("This is an unreachable if block.");
    } else {
      // Unreachable code block
      System.out.println("This is an unreachable else block.");
    }
    return f == foo.f;
  }

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}