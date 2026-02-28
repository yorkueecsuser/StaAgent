public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable statement");
    }
    
    return f == foo.f;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}