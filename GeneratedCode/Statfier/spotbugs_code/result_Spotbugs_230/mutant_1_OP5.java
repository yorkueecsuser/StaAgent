class EqualsComparison {
  public interface A {}

  public interface B {}

  void badEqualsComparision() {
    String s = "Hi there";
    Boolean b = Boolean.TRUE;

    System.out.println("equals() returned " + s.equals(b));

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  boolean literalStringEqualsDoNotReport(String s) {
    return "Uh huh".equals(s);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  boolean isEqualToNull(String s) {
    return s.equals(null);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  boolean unrelatedInterfaceComparison(A a, B b) {
    // This should be a medium priority warning
    return a.equals(b);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}

// vim:ts=3