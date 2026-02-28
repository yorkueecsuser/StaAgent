class Parent {
  @Override
  public boolean equals(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because there is no path to reach here
      System.out.println("This is an unreachable else block");
    }
    return false;
  }

  public void blargh() {}

  private boolean getCondition() {
    // This method always returns false, ensuring the if-else block remains unreachable
    return false;
  }
}