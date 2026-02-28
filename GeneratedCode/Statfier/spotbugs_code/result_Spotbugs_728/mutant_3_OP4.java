class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;

      // Introduced unreachable if-else statement
      boolean getCondition() {
        return false;
      }

      void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          System.out.println("This will never run");
        } else {
          System.out.println("This is also unreachable due to the method logic");
        }
      }
    }
  }

  static class Report2 {
    void Report2() {}
    ;

    // Introduced unreachable if-else statement
    boolean getCondition() {
      return false;
    }

    void someStaticMethod() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run");
      } else {
        System.out.println("This is also unreachable due to the method logic");
      }
    }
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}

    // Introduced unreachable if-else statement
    boolean getCondition() {
      return false;
    }

    void anotherMethod() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run");
      } else {
        System.out.println("This is also unreachable due to the method logic");
      }
    }
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}

    // Introduced unreachable if-else statement
    boolean getCondition() {
      return false;
    }

    void yetAnotherMethod() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run");
      } else {
        System.out.println("This is also unreachable due to the method logic");
      }
    }
  }
}