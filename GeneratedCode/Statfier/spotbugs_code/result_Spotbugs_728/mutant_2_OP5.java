class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;

      // Mutant code added here
      boolean getCondition() {
        return false;
      }

      void someMethod() {
        int value = getValue();
        switch(value) {
          case 1:
            // This case is unreachable because getValue() always returns 0
            System.out.println("This is unreachable");
            break;
        }
      }

      int getValue() {
        return 0;
      }
    }
  }

  static class Report2 {
    void Report2() {}
    ;

    // Mutant code added here
    boolean getCondition() {
      return false;
    }

    void someStaticMethod() {
      int value = getValue();
      switch(value) {
        case 1:
          // This case is unreachable because getValue() always returns 0
          System.out.println("This is unreachable");
          break;
      }
    }

    int getValue() {
      return 0;
    }
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}

    // Mutant code added here
    boolean getCondition() {
      return false;
    }

    void anotherMethod() {
      int value = getValue();
      switch(value) {
        case 1:
          // This case is unreachable because getValue() always returns 0
          System.out.println("This is unreachable");
          break;
      }
    }

    int getValue() {
      return 0;
    }
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}

    // Mutant code added here
    boolean getCondition() {
      return false;
    }

    void yetAnotherMethod() {
      int value = getValue();
      switch(value) {
        case 1:
          // This case is unreachable because getValue() always returns 0
          System.out.println("This is unreachable");
          break;
      }
    }

    int getValue() {
      return 0;
    }
  }
}