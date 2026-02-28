class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {
      int x = 5; // Hypothetical assignment statement for demonstration
      int x = 5; // Duplicate of the above statement
    }
    ;

    class DeeplyNested {
      void DeeplyNested() {
        boolean flag = true; // Hypothetical assignment statement for demonstration
        boolean flag = true; // Duplicate of the above statement
      }
      ;
    }
  }

  static class Report2 {
    void Report2() {
      double y = 3.14; // Hypothetical assignment statement for demonstration
      double y = 3.14; // Duplicate of the above statement
    }
    ;
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {
      char c = 'a'; // Hypothetical assignment statement for demonstration
      char c = 'a'; // Duplicate of the above statement
    }

    DoNotReport() {}
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      String s = "test"; // Hypothetical assignment statement for demonstration
      String s = "test"; // Duplicate of the above statement
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}
  }
}