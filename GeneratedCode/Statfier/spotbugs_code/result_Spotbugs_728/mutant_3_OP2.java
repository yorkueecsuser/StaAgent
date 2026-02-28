class AccidentalNonConstructorInInnerClass {

  class Report {
    void Report() {}
    ;

    int dummyVar1 = 0; // Original assignment
    int dummyVar1Copy = 0; // Duplicate assignment

    class DeeplyNested {
      void DeeplyNested() {}
      ;
      
      int dummyVar2 = 1; // Original assignment
      int dummyVar2Copy = 1; // Duplicate assignment
    }
  }

  static class Report2 {
    void Report2() {}
    ;
    
    boolean dummyVar3 = true; // Original assignment
    boolean dummyVar3Copy = true; // Duplicate assignment
  }

  class DoNotReport {
    @Deprecated
    void DoNotReport() {}

    DoNotReport() {}
    
    char dummyVar4 = 'a'; // Original assignment
    char dummyVar4Copy = 'a'; // Duplicate assignment
  }

  static class DoNotReport2 {
    void DoNotReport2() {
      throw new UnsupportedOperationException();
    }

    DoNotReport2() {}
    
    double dummyVar5 = 3.14; // Original assignment
    double dummyVar5Copy = 3.14; // Duplicate assignment
  }
}