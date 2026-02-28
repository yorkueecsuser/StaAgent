class Parent {
  @Override
  public boolean equals(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
    return false;
  }

  public void blargh() {
    boolean conditionBlargh = getCondition();
    if (conditionBlargh) {
      // Unreachable code
      System.out.println("This is another unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}