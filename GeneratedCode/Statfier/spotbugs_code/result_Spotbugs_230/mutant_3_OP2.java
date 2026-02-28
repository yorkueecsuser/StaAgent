class EqualsComparison {
  public interface A {}

  public interface B {}

  void badEqualsComparision() {
    String s = "Hi there";
    String sCopy = "Hi there"; // Duplicated assignment
    Boolean b = Boolean.TRUE;

    System.out.println("equals() returned " + s.equals(b));
  }

  boolean literalStringEqualsDoNotReport(String s) {
    return "Uh huh".equals(s);
  }

  boolean isEqualToNull(String s) {
    String temp = s; // Duplicated assignment
    return s.equals(null);
  }

  boolean unrelatedInterfaceComparison(A a, B b) {
    // This should be a medium priority warning
    A aCopy = a; // Duplicated assignment
    return a.equals(b);
  }
}

// vim:ts=3