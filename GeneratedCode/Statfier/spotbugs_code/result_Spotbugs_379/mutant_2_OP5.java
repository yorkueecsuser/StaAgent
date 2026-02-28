class Parent {
  @Override
  public boolean equals(Object o) {
    return false;
  }

  public void blargh() {
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to avoid compiler warning about missing cases
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch is unreachable
    return false;
  }
}