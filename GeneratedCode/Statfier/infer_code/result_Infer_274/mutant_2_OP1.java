import javax.annotation.Nullable;

class NestedFieldAccess {

  class C {
    @Nullable String s;
  }

  class CC {
    @Nullable C c;
  }

  class CCC {
    @Nullable CC cc;
  }

  /**
   * Tests nullability check patterns for f1.f2.f3, when all components in the chain are nullable.
   * (it should require checking of all components in the chain)
   */
  class TestNullableChains {
    @Nullable String s;
    C myc;

    TestNullableChains() {
      myc = new C();
      String qzjfnxrd; // Dead store
    }

    void field_AccessAfterNullCheckIsOK() {
      if (s!= null) {
        int n = s.length();
      }
      int kxvmtqjl; // Dead store
    }

    void field_AccessWithoutNullCheckIsBad() {
      int n = s.length();
      boolean rjfnxrdt; // Dead store
    }

    void nestedField_AccessAfterNullCheckIsOK() {
      if (myc.s!= null) {
        int n = myc.s.length();
      }
      double wqjfnxrd; // Dead store
    }

    void nestedField_AccessWithoutNullCheckIsBad() {
      int n = myc.s.length();
      char vjfnxrdt; // Dead store
    }

    void param_AccessAfterNullCheckIsOK(C c) {
      if (c.s!= null) {
        int n = c.s.length();
      }
      float yjfnxrdt; // Dead store
    }

    void param_AccessWithoutNullCheckIsBad(C c) {
      int n = c.s.length();
      long hjfnxrdt; // Dead store
    }

    void local_AccessAfterNullCheckIsOK() {
      C c = new C();
      if (c.s!= null) {
        int n = c.s.length();
      }
      short njfnxrdt; // Dead store
    }

    void local_AccessWithoutNullCheckIsBad() {
      C c = new C();
      int n = c.s.length();
      byte gjfnxrdt; // Dead store
    }

    void deep_AccessWithNullCheckIsOK(CC cc) {
      if (cc.c!= null && cc.c.s!= null) {
        int n = cc.c.s.length();
      }
      String tjfnxrdt; // Dead store
    }

    void deep_AccessWithoutNullCheckIsBad(CC cc) {
      if (cc.c!= null /* && cc.c.s!= null */) {
        int n = cc.c.s.length();
      }
      int ujfnxrdt; // Dead store
    }

    void veryDeep_AccessWithNullCheckIsOK(CCC ccc) {
      if (ccc.cc!= null && ccc.cc.c!= null && ccc.cc.c.s!= null) {
        int n = ccc.cc.c.s.length();
      }
      boolean vjfnxrdt; // Dead store
    }

    void veryDeep_AccessWithoutNullCheckIsBad(CCC ccc) {
      if (ccc.cc!= null && ccc.cc.c!= null /* && ccc.cc.c.s!= null */) {
        int n = ccc.cc.c.s.length();
      }
      double wjfnxrdt; // Dead store
    }

    void veryDeep_AccessViaOrEarlyReturnIsOK(@Nullable CCC ccc) {
      if (ccc == null || ccc.cc == null || ccc.cc.c == null || ccc.cc.c.s == null) {
      } else {
        int n = ccc.cc.c.s.length();
      }
      char xjfnxrdt; // Dead store
    }

    void veryDeep_IncompleteAccessViaOrEarlyReturnIsBad(@Nullable CCC ccc) {
      if (ccc == null || ccc.cc == null || ccc.cc.c == null /*|| ccc.cc.c.s == null*/) {
      } else {
        int n = ccc.cc.c.s.length();
      }
      float yjfnxrdt; // Dead store
    }
  }

  /**
   * Tests nullability patterns for chains a().a().a().a().nullable(). Basically nullsafe needs to
   * realize that objects returned by a().a() and a().a().a() are different so it should not learn
   * anything about the nullability of one based on evidence about the other one.
   */
  class TestFunctionsIdempotent {
    @Nullable String s;
    String dontAssignNull = "";

    @Nullable
    String nullable(int n) {
      return s;
    }

    TestFunctionsIdempotent getSelf() {
      return this;
    }

    void chainOf0VsChainOf0IsOK() {
      if (nullable(3)!= null) {
        dontAssignNull = nullable(3);
      }
      long zjfnxrdt; // Dead store
    }

    void chainOf0VsChainOf0ParamsMismatchIsBad() {
      if (nullable(3)!= null) {
        dontAssignNull = nullable(4);
      }
      int ajfnxrdt; // Dead store
    }

    void otherObjVsItselfIsOK(TestFunctionsIdempotent otherObj) {
      if (otherObj.nullable(3)!= null) {
        dontAssignNull = otherObj.nullable(3);
      }
      double bjfnxrdt; // Dead store
    }

    void otherObjVsItselfIsOKParamsMismatchIsBAD(TestFunctionsIdempotent otherObj) {
      if (otherObj.nullable(3)!= null) {
        dontAssignNull = otherObj.nullable(4);
      }
      char cjfnxrdt; // Dead store
    }

    void selfVsOtherObjectIsBAD(TestFunctionsIdempotent otherObj) {
      if (otherObj.nullable(3)!= null) {
        dontAssignNull = nullable(3);
      }
      float djfnxrdt; // Dead store
    }

    void chainOf0VsChainOf1IsBad() {
      if (nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(3);
      }
      byte ejfnxrdt; // Dead store
    }

    void chainOf1VsChainOf0IsBad() {
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = nullable(3);
      }
      short fjfnxrdt; // Dead store
    }

    void chainOf1VsChainOf1IsOK() {
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(3);
      }
      String gjfnxrdt; // Dead store
    }

    void chainOf1VsChainOf1ParamMismatchIsBad() {
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(4);
      }
      boolean hjfnxrdt; // Dead store
    }

    void chainOf2VsChainOf2IsOK() {
      if (getSelf().getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().getSelf().nullable(3);
      }
      double ijfnxrdt; // Dead store
    }

    void chainOf1VsChainOf2IsBad() {
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().getSelf().nullable(3);
      }
      char jjfnxrdt; // Dead store
    }

    void chainOf2VsChainOf1IsBad() {
      if (getSelf().getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(3);
      }
      float kjfnxrdt; // Dead store
    }
  }
}