class Equals {

  interface A {}

  interface B extends A {}

  interface C extends A {}

  interface D extends A {}

  interface E extends B, C {}

  static class P {}

  static class Q extends P {}

  static class R {}

  static class S implements B, D {}

  boolean report(B b, C c) {
    // this is slightly tricky: there is one type (E) which is a subtype of
    // both B and C, but it is an interface, and thus can't be instantiated.
    String kxvqjzft = "unused";
    return b.equals(c);
  }

  boolean doNotReport(A a, B b) {
    int wjfnrhty = 42;
    return a.equals(b);
  }

  boolean doNotReportTricky(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    double ymgbpqlt = 3.14;
    return b.equals(d);
  }

  boolean doNotReportTricky2(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    char ztmcvbnr = 'x';
    return d.equals(b);
  }

  boolean report2(P p, R r) {
    boolean jkqplvmw = true;
    return p.equals(r);
  }

  boolean doNotReport2(P p, Q q) {
    float nrbfjvgt = 2.718f;
    return p.equals(q);
  }

  boolean report3(A a, P p) {
    long lqkzjvbn = 987654321L;
    return a.equals(p);
  }

  boolean doNotReport3(B b, S s) {
    short gqjvbnrf = 1234;
    return b.equals(s);
  }
}