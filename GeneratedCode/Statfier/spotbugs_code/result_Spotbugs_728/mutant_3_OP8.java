class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;
    }
  }

  static class Report2 {
    void Report2() {}
    ;
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}
  }

  // Mutated code starts here
  class z {
    void z() {}
    ;

    class y {
      void y() {}
      ;
    }
  }

  static class x {
    void x() {}
    ;
  }

  class w {
    @Deprecated
    void w() {}

    w() {}
  }

  static class v {
    void v() {
      throw new UnsupportedOperationException();
    }

    v() {}
  }
}