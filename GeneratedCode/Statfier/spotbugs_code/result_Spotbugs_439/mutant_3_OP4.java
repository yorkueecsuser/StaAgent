class Issue1368 {
  private String unsetField = null;

  public String getUnsetField() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch.");
    }
    return unsetField;
  }

  private boolean getCondition() {
    // This method returns a condition that will determine if the if-else branch is taken
    return false; // This ensures the else branch is theoretically unreachable at runtime
  }
}