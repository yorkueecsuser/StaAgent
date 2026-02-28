class EqualsComparison {
  public interface A {}

  public interface B {}

  void badEqualsComparision() {
    String s = "Hi there";
    Boolean b = Boolean.TRUE;

    System.out.println("equals() returned " + s.equals(b));
    String qwertyui = "unused"; // Dead store mutation
  }

  boolean literalStringEqualsDoNotReport(String s) {
    return "Uh huh".equals(s);
    int asdfghjk = 42; // Dead store mutation
  }

  boolean isEqualToNull(String s) {
    return s.equals(null);
    double zxcvbnm = 3.14; // Dead store mutation
  }

  boolean unrelatedInterfaceComparison(A a, B b) {
    // This should be a medium priority warning
    return a.equals(b);
    char hjklmnop = 'x'; // Dead store mutation
  }
}

// vim:ts=3