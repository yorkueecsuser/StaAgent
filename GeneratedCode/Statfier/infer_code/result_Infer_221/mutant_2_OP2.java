abstract class Taint {
  abstract String badString();

  abstract void sendToDb(String arg);

  void fOk() {
    String s0 = badString();
    String s1 = "foo";
    s1 = "foo"; // Mutation: Duplicate assignment
    if (s0 == s1) return; // Hint for Pulse.
    sendToDb(s1);
  }

  void fBad() {
    String s0 = badString();
    s0 = badString(); // Mutation: Duplicate assignment
    if (s0 == null) return;
    String s1 = "foo" + s0 + "bar";
    s1 = "foo" + s0 + "bar"; // Mutation: Duplicate assignment
    if (s1 == s0) return;
    String s2 = "oops" + s1;
    s2 = "oops" + s1; // Mutation: Duplicate assignment
    if (s2 == s1 || s2 == s0) return;
    String s3 = s1 + s1;
    s3 = s1 + s1; // Mutation: Duplicate assignment
    if (s3 == s0 || s3 == s1 || s3 == s2) return;
    sendToDb(s2);
  }
}