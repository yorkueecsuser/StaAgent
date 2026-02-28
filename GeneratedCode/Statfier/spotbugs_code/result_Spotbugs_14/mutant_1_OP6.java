class EqStringTestIsBetter {
  public boolean test(String a) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }

    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
  }

  private boolean getCondition() {
    return false;
  }
}