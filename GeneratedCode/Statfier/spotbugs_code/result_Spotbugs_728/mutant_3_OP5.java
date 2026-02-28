class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;

      // Inserting unreachable switch statement
      boolean getCondition() { return false; }
      void someMethod() {
        int value = getValue();
        switch(value) {
          case 1:
            System.out.println("This is case 1");
            break;
          case 2:
            System.out.println("This is case 2");
            break;
        }
      }

      int getValue() { return 0; }
    }
  }

  static class Report2 {
    void Report2() {}
    ;

    // Inserting unreachable switch statement
    boolean getCondition() { return false; }
    void someStaticMethod() {
      int value = getValue();
      switch(value) {
        case 1:
          System.out.println("This is case 1 in Report2");
          break;
        case 2:
          System.out.println("This is case 2 in Report2");
          break;
      }
    }

    int getValue() { return 0; }
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}

    // Inserting unreachable switch statement
    boolean getCondition() { return false; }
    void anotherMethod() {
      int value = getValue();
      switch(value) {
        case 1:
          System.out.println("This is case 1 in DoNotReport");
          break;
        case 2:
          System.out.println("This is case 2 in DoNotReport");
          break;
      }
    }

    int getValue() { return 0; }
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}

    // Inserting unreachable switch statement
    boolean getCondition() { return false; }
    void yetAnotherMethod() {
      int value = getValue();
      switch(value) {
        case 1:
          System.out.println("This is case 1 in DoNotReport2");
          break;
        case 2:
          System.out.println("This is case 2 in DoNotReport2");
          break;
      }
    }

    int getValue() { return 0; }
  }
}