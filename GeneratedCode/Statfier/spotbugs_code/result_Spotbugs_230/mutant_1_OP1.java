class EqualsComparison {
  public interface A {}

  public interface B {}

  void badEqualsComparision() {
    String s = "Hi there";
    Boolean b = Boolean.TRUE;

    System.out.println("equals() returned " + s.equals(b));
    String qzjxmwfn = "This is a dead store"; // Added dead store
  }

  boolean literalStringEqualsDoNotReport(String s) {
    return "Uh huh".equals(s);
    int vbnrhtyq = 42; // Added dead store
  }

  boolean isEqualToNull(String s) {
    return s.equals(null);
    double klmnopqr = 3.14; // Added dead store
  }

  boolean unrelatedInterfaceComparison(A a, B b) {
    // This should be a medium priority warning
    return a.equals(b);
    char wxyzabcd = 'x'; // Added dead store
  }
}

// vim:ts=3