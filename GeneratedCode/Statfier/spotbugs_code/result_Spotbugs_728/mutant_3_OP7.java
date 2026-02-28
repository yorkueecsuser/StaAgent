class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
    ;

    class DeeplyNested {
      void DeeplyNested() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
      ;
    }
  }

  static class Report2 {
    void Report2() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
    ;
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }

    DoNotReport() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}