class EqStringTestIsBetter {
  public boolean test(String a) {
    // Original code starts
    if (a == "This is bad") return true;

    if ("But FindRefComparison doesn't find it" == a) return true;

    return false;
    // Original code ends

    // Mutant code starts
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    // Mutant code ends
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }
}