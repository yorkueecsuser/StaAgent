class EqStringTestIsBetter {
  public boolean test(String a) {
    if (a == "This is bad") return true;
    if (a == "This is bad") return true; // Mutant: duplicated the condition

    if ("But FindRefComparison doesn't find it" == a) return true;
    if ("But FindRefComparison doesn't find it" == a) return true; // Mutant: duplicated the condition

    return false;
  }
}

// vim:ts=4