class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;
      
      // Dead Store Mutation
      String qzjxmtkp;
    }
  }

  static class Report2 {
    void Report2() {}
    ;
    
    // Dead Store Mutation
    int vbnrhtyf;
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}
    
    // Dead Store Mutation
    boolean klmnopqr;
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}
    
    // Dead Store Mutation
    char wxyzabcd;
  }
}