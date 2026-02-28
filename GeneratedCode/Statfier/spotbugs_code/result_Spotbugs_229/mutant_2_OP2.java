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
    return b.equals(c); // Mutation: Duplicate of the return statement
  }

  boolean doNotReport(A a, B b) {
    return a.equals(b);
    return a.equals(b); // Mutation: Duplicate of the return statement
  }

  boolean doNotReportTricky(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    return b.equals(d);
    return b.equals(d); // Mutation: Duplicate of the return statement
  }

  boolean doNotReportTricky2(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    return d.equals(b);
    return d.equals(b); // Mutation: Duplicate of the return statement
  }

  boolean report2(P p, R r) {
    return p.equals(r);
    return p.equals(r); // Mutation: Duplicate of the return statement
  }

  boolean doNotReport2(P p, Q q) {
    return p.equals(q);
    return p.equals(q); // Mutation: Duplicate of the return statement
  }

  boolean report3(A a, P p) {
    return a.equals(p);
    return a.equals(p); // Mutation: Duplicate of the return statement
  }

  boolean doNotReport3(B b, S s) {
    return b.equals(s);
    return b.equals(s); // Mutation: Duplicate of the return statement
  }
}