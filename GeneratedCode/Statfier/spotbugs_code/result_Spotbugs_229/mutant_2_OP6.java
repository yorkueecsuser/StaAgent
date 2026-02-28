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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable loop
    }
    return b.equals(c);
  }

  boolean doNotReport(A a, B b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable loop
    }
    return a.equals(b);
  }

  boolean doNotReportTricky(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable loop
    }
    return b.equals(d);
  }

  boolean doNotReportTricky2(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable loop
    }
    return d.equals(b);
  }

  boolean report2(P p, R r) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable loop
    }
    return p.equals(r);
  }

  boolean doNotReport2(P p, Q q) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable loop
    }
    return p.equals(q);
  }

  boolean report3(A a, P p) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable loop
    }
    return a.equals(p);
  }

  boolean doNotReport3(B b, S s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable loop
    }
    return b.equals(s);
  }

  private boolean getCondition() {
    return false;
  }
}