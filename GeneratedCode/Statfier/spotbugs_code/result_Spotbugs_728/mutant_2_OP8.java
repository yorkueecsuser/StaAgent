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

  // Mutated code
  class a {
    void a() {}
    ;

    class b {
      void b() {}
      ;
    }
  }

  static class c {
    void c() {}
    ;
  }

  class d {
    @Deprecated
    void d() {}

    d() {}
  }

  static class e {
    void e() {
      throw new UnsupportedOperationException();
    }

    e() {}
  }
}