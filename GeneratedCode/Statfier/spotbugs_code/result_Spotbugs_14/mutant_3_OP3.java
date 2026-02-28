class EqStringTestIsBetter {
  public boolean test(String a) {
    // Original code starts
    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
    // Original code ends

    // Mutant code starts
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      return true;
    }
    // Mutant code ends
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}