abstract class Taint {
  abstract String badString();

  abstract void sendToDb(String arg);

  void fOk() {
    String s0 = badString();
    String s1 = "foo";
    if (s0 == s1) return; // Hint for Pulse.
    sendToDb(s1);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  void fBad() {
    String s0 = badString();
    if (s0 == null) return;
    String s1 = "foo" + s0 + "bar";
    if (s1 == s0) return;
    String s2 = "oops" + s1;
    if (s2 == s1 || s2 == s0) return;
    String s3 = s1 + s1;
    if (s3 == s0 || s3 == s1 || s3 == s2) return;
    sendToDb(s2);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
  }

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }
}