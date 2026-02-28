class EqStringTestIsBetter {
  public boolean test(String a) {
    // Original code starts
    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
    // Original code ends

    // Mutated code starts
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      return true;
    }
    // Mutated code ends
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}