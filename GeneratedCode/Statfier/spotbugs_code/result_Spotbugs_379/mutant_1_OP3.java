class Parent {
  @Override
  public boolean equals(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() will never return true
      System.out.println("This is an unreachable statement.");
    }
    return false;
  }

  public void blargh() {}

  private boolean getCondition() {
    // This method always returns false, ensuring the if statement remains unreachable
    return false;
  }
}