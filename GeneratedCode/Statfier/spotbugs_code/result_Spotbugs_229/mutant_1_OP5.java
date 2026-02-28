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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  boolean doNotReport(A a, B b) {
    return a.equals(b);
  }

  boolean doNotReportTricky(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    return b.equals(d);
  }

  boolean doNotReportTricky2(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    return d.equals(b);
  }

  boolean report2(P p, R r) {
    return p.equals(r);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  boolean doNotReport2(P p, Q q) {
    return p.equals(q);
  }

  boolean report3(A a, P p) {
    return a.equals(p);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  boolean doNotReport3(B b, S s) {
    return b.equals(s);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}