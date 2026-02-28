class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;
    void Report() {} // Duplicate

    class DeeplyNested {
      void DeeplyNested() {}
      ;
      void DeeplyNested() {} // Duplicate
    }
  }

  static class Report2 {
    void Report2() {}
    ;
    void Report2() {} // Duplicate
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}
    DoNotReport() {} // Duplicate
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}
    DoNotReport2() {} // Duplicate
  }
}