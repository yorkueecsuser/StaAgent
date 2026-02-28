class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    // Original code
    return false;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This case will always be executed, but it does nothing
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}