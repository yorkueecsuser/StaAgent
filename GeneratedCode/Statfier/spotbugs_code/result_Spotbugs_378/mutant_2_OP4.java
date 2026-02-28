class Equality {

  public boolean equals(Equality e) {
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      return false;
    } else {
      // This block will also never execute because shouldRun is always false
      return true;
    }
    return true;
  }

  @Override
  public boolean equals(Object o) {
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      return true;
    } else {
      // This block will also never execute because shouldRun is always false
      return false;
    }
    return false;
  }

  private boolean getCondition() {
    // Always returns false to ensure the if-else branches are unreachable
    return false;
  }

  public static void main(String[] args) {}
}