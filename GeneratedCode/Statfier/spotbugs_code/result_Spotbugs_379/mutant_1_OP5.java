class Parent {
  @Override
  public boolean equals(Object o) {
    return false;
  }

  public void blargh() {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also never be reached due to the same reason
        System.out.println("This is also an unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}