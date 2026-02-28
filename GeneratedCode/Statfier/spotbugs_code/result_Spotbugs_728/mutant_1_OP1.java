class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;

      // Dead Store Mutation
      String yxqjvbnr = "unused";
    }
  }

  static class Report2 {
    void Report2() {}
    ;

    // Dead Store Mutation
    int klmnopqr = 42;
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}

    // Dead Store Mutation
    boolean abcdefgh = true;
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}

    // Dead Store Mutation
    double wxyzmnop = 3.14;
  }
}