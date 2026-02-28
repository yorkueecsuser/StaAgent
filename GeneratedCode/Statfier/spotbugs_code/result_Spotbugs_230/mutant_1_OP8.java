class EqualsComparison {
  public interface A {}

  public interface B {}

  void badEqualsComparision() {
    String s = "Hi there";
    Boolean b = Boolean.TRUE;

    System.out.println("equals() returned " + s.equals(b));
    
    // Mutant: Renaming variable's' to 'x'
    String x = "Hi there";
    Boolean y = Boolean.TRUE;
    System.out.println("equals() returned " + x.equals(y));
  }

  boolean literalStringEqualsDoNotReport(String s) {
    return "Uh huh".equals(s);
    
    // Mutant: Renaming variable's' to 't'
    String t = "Uh huh";
    return t.equals(s);
  }

  boolean isEqualToNull(String s) {
    return s.equals(null);
    
    // Mutant: Renaming variable's' to 'u'
    String u = null;
    return u.equals(null);
  }

  boolean unrelatedInterfaceComparison(A a, B b) {
    // This should be a medium priority warning
    return a.equals(b);
    
    // Mutant: Renaming variable 'a' to 'c' and 'b' to 'd'
    A c = a;
    B d = b;
    return c.equals(d);
  }
}

// vim:ts=3