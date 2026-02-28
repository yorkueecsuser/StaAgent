class EqStringTestIsBetter {
  public boolean test(String a) {
    if (a == "This is bad") return true;

    // Dead store mutation
    String qzjfnrvt = "unusedVariable";

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
  }
}

// vim:ts=4