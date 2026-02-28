class EqualsComparison {
  public interface A {}

  public interface B {}

  void badEqualsComparision() {
    String s = "Hi there";
    Boolean b = Boolean.TRUE;

    System.out.println("equals() returned " + s.equals(b));
    
    // Mutant
    String x = "Hi there";
    Boolean y = Boolean.TRUE;
    System.out.println("equals() returned " + x.equals(y));
  }

  boolean literalStringEqualsDoNotReport(String s) {
    return "Uh huh".equals(s);
    
    // Mutant
    String t = "Uh huh";
    return t.equals(s);
  }

  boolean isEqualToNull(String s) {
    return s.equals(null);
    
    // Mutant
    String u = s;
    return u.equals(null);
  }

  boolean unrelatedInterfaceComparison(A a, B b) {
    // This should be a medium priority warning
    return a.equals(b);
    
    // Mutant
    A c = a;
    B d = b;
    return c.equals(d);
  }
}

// vim:ts=3