class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;

      // Introduced unreachable switch statement
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
          default:
            System.out.println("Default case");
        }
      }

      int getValue() { return 0; }
    }
  }

  static class Report2 {
    void Report2() {}
    ;

    // Introduced unreachable switch statement
    boolean getCondition() { return false; }
    void someStaticMethod() {
      int value = getValue();
      switch(value) {
        case 1:
          System.out.println("Static This is case 1");
          break;
        case 2:
          System.out.println("Static This is case 2");
          break;
        default:
          System.out.println("Static Default case");
      }
    }

    int getValue() { return 0; }
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}

    // Introduced unreachable switch statement
    boolean getCondition() { return false; }
    void anotherMethod() {
      int value = getValue();
      switch(value) {
        case 1:
          System.out.println("Another This is case 1");
          break;
        case 2:
          System.out.println("Another This is case 2");
          break;
        default:
          System.out.println("Another Default case");
      }
    }

    int getValue() { return 0; }
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}

    // Introduced unreachable switch statement
    boolean getCondition() { return false; }
    void yetAnotherMethod() {
      int value = getValue();
      switch(value) {
        case 1:
          System.out.println("Yet Another This is case 1");
          break;
        case 2:
          System.out.println("Yet Another This is case 2");
          break;
        default:
          System.out.println("Yet Another Default case");
      }
    }

    int getValue() { return 0; }
  }
}