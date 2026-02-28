class EqStringTestIsBetter {
  public boolean test(String a) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }

    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
  }

  private boolean getCondition() {
    // This method returns false, making the for loop unreachable
    return false;
  }
}

// vim:ts=4