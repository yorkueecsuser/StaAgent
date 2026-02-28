class EqStringTestIsBetter {
  public boolean test(String a) {
    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
  }

  // Mutant code
  public boolean test(String b) {
    if (b == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == b) return true;

    return false;
  }
}