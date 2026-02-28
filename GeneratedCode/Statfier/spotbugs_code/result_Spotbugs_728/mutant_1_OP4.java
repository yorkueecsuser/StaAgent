class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;

      // Mutant addition
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable code
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class Report2 {
    void Report2() {}
    ;

    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }

    private static boolean getCondition() {
      return false;
    }
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}

    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }

    private boolean getCondition() {
      return false;
    }
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}

    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }

    private static boolean getCondition() {
      return false;
    }
  }
}