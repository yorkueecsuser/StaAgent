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

  boolean report(B x, C y) {
    // this is slightly tricky: there is one type (E) which is a subtype of
    // both B and C, but it is an interface, and thus can't be instantiated.
    return x.equals(y);
  }

  boolean doNotReport(A a, B z) {
    return a.equals(z);
  }

  boolean doNotReportTricky(B b, D v) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    return b.equals(v);
  }

  boolean doNotReportTricky2(B w, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    return d.equals(w);
  }

  boolean report2(P p, R t) {
    return p.equals(t);
  }

  boolean doNotReport2(P p, Q u) {
    return p.equals(u);
  }

  boolean report3(A g, P h) {
    return g.equals(h);
  }

  boolean doNotReport3(B i, S j) {
    return i.equals(j);
  }
}