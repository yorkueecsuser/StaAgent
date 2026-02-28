class EqStringTestIsBetter {
  public boolean test(String a) {
    // Introducing an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }

    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}