abstract class Taint {
  abstract String badString();

  abstract void sendToDb(String arg);

  void fOk() {
    String s0 = badString();
    String s1 = "foo";
    if (s0 == s1) return; // Hint for Pulse.
    sendToDb(s1);
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

    // Mutated code
    String a = badString();
    if (a == null) return;
    String b = "foo" + a + "bar";
    if (b == a) return;
    String c = "oops" + b;
    if (c == b || c == a) return;
    String d = b + b;
    if (d == a || d == b || d == c) return;
    sendToDb(c);
  }
}