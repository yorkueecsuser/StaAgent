abstract class Taint {
  abstract String badString();

  abstract void sendToDb(String arg);

  void fOk() {
    String s0 = badString();
    String s1 = "foo";
    if (s0 == s1) return; // Hint for Pulse.
    sendToDb(s1);

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run");
    } else {
      System.out.println("This should also never run");
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

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This should never run in fBad");
    } else {
      System.out.println("This should also never run in fBad");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}