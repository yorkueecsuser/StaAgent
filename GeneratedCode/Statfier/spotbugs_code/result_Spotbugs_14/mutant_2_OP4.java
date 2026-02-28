class EqStringTestIsBetter {
  public boolean test(String a) {
    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      return true;
    } else {
      // This block is also intended to be unreachable
      return false;
    }

    return false;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}

// vim:ts=4