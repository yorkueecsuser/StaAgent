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
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return b.equals(c);
  }

  boolean doNotReport(A a, B b) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return a.equals(b);
  }

  boolean doNotReportTricky(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return b.equals(d);
  }

  boolean doNotReportTricky2(B b, D d) {
    // the interfaces themselves are unrelated, but a class implementing
    // both interfaces exists
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return d.equals(b);
  }

  boolean report2(P p, R r) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return p.equals(r);
  }

  boolean doNotReport2(P p, Q q) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return p.equals(q);
  }

  boolean report3(A a, P p) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return a.equals(p);
  }

  boolean doNotReport3(B b, S s) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Another unreachable code
      System.out.println("This is also unreachable");
    }
    return b.equals(s);
  }

  private boolean getCondition() {
    return false;
  }
}