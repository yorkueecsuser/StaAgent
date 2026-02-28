class EqualsComparison {
  public interface A {}

  public interface B {}

  void badEqualsComparision() {
    String s = "Hi there";
    Boolean b = Boolean.TRUE;

    System.out.println("equals() returned " + s.equals(b));

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition being false.");
    }
  }

  boolean literalStringEqualsDoNotReport(String s) {
    return "Uh huh".equals(s);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition being false.");
    }
  }

  boolean isEqualToNull(String s) {
    return s.equals(null);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition being false.");
    }
  }

  boolean unrelatedInterfaceComparison(A a, B b) {
    // This should be a medium priority warning
    return a.equals(b);

    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition being false.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}

// vim:ts=3