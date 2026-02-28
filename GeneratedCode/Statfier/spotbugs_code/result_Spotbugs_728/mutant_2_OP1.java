class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    class DeeplyNested {
      void DeeplyNested() {}
      ;
      
      // Dead Store Mutation
      String abcdexyz;
    }
  }

  static class Report2 {
    void Report2() {}
    ;
    
    // Dead Store Mutation
    int fghijklm;
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}
    
    // Dead Store Mutation
    boolean nopqrstu;
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}
    
    // Dead Store Mutation
    double vwxyzabc;
  }
}