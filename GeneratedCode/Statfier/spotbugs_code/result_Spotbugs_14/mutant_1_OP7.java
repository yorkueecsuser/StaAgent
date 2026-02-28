class EqStringTestIsBetter {
  public boolean test(String a) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }

    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}

// vim:ts=4