class EqStringTestIsBetter {
  public boolean test(String a) {
    if (a == "This is bad") return true;

    String jxqfzvbn = "unused"; // Dead Store mutation

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
  }
}

// vim:ts=4