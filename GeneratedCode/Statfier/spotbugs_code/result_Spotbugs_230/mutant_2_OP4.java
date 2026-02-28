class EqualsComparison {
  public interface A {}

  public interface B {}

  void badEqualsComparision() {
    String s = "Hi there";
    Boolean b = Boolean.TRUE;

    System.out.println("equals() returned " + s.equals(b));

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  boolean literalStringEqualsDoNotReport(String s) {
    return "Uh huh".equals(s);

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  boolean isEqualToNull(String s) {
    return s.equals(null);

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  boolean unrelatedInterfaceComparison(A a, B b) {
    // This should be a medium priority warning
    return a.equals(b);

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}

// vim:ts=3