class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;

      // Mutant: Inserting an unreachable if-else statement
      boolean getCondition() { return false; }
      void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          System.out.println("This will never run");
        } else {
          System.out.println("This will also never run");
        }
      }
    }
  }

  static class Report2 {
    void Report2() {}
    ;

    // Mutant: Inserting an unreachable if-else statement
    boolean getCondition() { return false; }
    void someStaticMethod() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run in static context");
      } else {
        System.out.println("This will also never run in static context");
      }
    }
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}

    // Mutant: Inserting an unreachable if-else statement
    boolean getCondition() { return false; }
    void anotherMethod() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run in DoNotReport");
      } else {
        System.out.println("This will also never run in DoNotReport");
      }
    }
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}

    // Mutant: Inserting an unreachable if-else statement
    boolean getCondition() { return false; }
    void yetAnotherMethod() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run in DoNotReport2");
      } else {
        System.out.println("This will also never run in DoNotReport2");
      }
    }
  }
}