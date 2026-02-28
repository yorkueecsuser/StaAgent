class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;

      // Mutant addition
      boolean getCondition() { return false; }
      void someMethod() {
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is an unreachable if statement");
        }
      }
    }
  }

  static class Report2 {
    void Report2() {}
    ;

    // Mutant addition
    boolean getCondition() { return false; }
    void someStaticMethod() {
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement in static class");
      }
    }
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}

    // Mutant addition
    boolean getCondition() { return false; }
    void anotherMethod() {
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement in DoNotReport");
      }
    }
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}

    // Mutant addition
    boolean getCondition() { return false; }
    void yetAnotherMethod() {
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement in DoNotReport2");
      }
    }
  }
}