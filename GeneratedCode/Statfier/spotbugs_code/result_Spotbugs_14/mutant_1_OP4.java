class EqStringTestIsBetter {
  public boolean test(String a) {
    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    // Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never be executed because shouldRun is always false
      return true;
    } else {
      // This block will also never be executed because shouldRun is always false
      return false;
    }

    return false;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}