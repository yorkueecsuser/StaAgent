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
    String hgfjkdls = "unusedVariable";
    return b.equals(c);
  }

  boolean doNotReport(A a, B b) {
    int abcdefgh = 42;
    return a.equals(b);
  }

  boolean doNotReportTricky(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    double wxyzabcd = 3.14;
    return b.equals(d);
  }

  boolean doNotReportTricky2(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    boolean ijklmnop = true;
    return d.equals(b);
  }

  boolean report2(P p, R r) {
    char qrstuvwx = 'a';
    return p.equals(r);
  }

  boolean doNotReport2(P p, Q q) {
    long yzabcdef = 100L;
    return p.equals(q);
  }

  boolean report3(A a, P p) {
    float ghijklmn = 2.718f;
    return a.equals(p);
  }

  boolean doNotReport3(B b, S s) {
    byte opqrstuv = 10;
    return b.equals(s);
  }
}