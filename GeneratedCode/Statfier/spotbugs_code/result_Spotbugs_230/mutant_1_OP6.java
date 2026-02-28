class EqualsComparison {
  public interface A {}

  public interface B {}

  void badEqualsComparision() {
    String s = "Hi there";
    Boolean b = Boolean.TRUE;

    System.out.println("equals() returned " + s.equals(b));

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  boolean literalStringEqualsDoNotReport(String s) {
    return "Uh huh".equals(s);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  boolean isEqualToNull(String s) {
    return s.equals(null);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  boolean unrelatedInterfaceComparison(A a, B b) {
    // This should be a medium priority warning
    return a.equals(b);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  private boolean getCondition() {
    return false;
  }
}

// vim:ts=3