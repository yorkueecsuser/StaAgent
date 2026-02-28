class EqStringTestIsBetter {
  public boolean test(String a) {
    // Introducing an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }

    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
  }

  private boolean getCondition() {
    // This method returns false, ensuring the while loop remains unreachable
    return false;
  }
}

// vim:ts=4