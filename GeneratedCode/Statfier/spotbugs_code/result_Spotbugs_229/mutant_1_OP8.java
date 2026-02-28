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
    return b.equals(c);
  }

  boolean doNotReport(A a, B b) {
    return a.equals(b);
  }

  boolean doNotReportTricky(B x, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    return x.equals(d);
  }

  boolean doNotReportTricky2(B b, D y) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    return y.equals(b);
  }

  boolean report2(P p, R r) {
    return p.equals(r);
  }

  boolean doNotReport2(P z, Q q) {
    return z.equals(q);
  }

  boolean report3(A a, P p) {
    return a.equals(p);
  }

  boolean doNotReport3(B b, S s) {
    return b.equals(s);
  }
}