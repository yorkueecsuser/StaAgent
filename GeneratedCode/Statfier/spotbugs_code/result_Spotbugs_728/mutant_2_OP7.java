class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;

      // Mutant code: Unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  static class Report2 {
    void Report2() {}
    ;

    // Mutant code: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}

    // Mutant code: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}

    // Mutant code: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false;
  }
}