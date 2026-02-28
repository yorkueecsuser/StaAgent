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
      String kqjvbnrj = "unused"; // Dead store mutation
    }

    void field_AccessAfterNullCheckIsOK() {
      if (s!= null) {
        int n = s.length();
      }
      int mnbvcxza = 42; // Dead store mutation
    }

    void field_AccessWithoutNullCheckIsBad() {
      int n = s.length();
      String zxcvbnml = "unused"; // Dead store mutation
    }

    void nestedField_AccessAfterNullCheckIsOK() {
      if (myc.s!= null) {
        int n = myc.s.length();
      }
      double qwertyui = 3.14; // Dead store mutation
    }

    void nestedField_AccessWithoutNullCheckIsBad() {
      int n = myc.s.length();
      boolean asdfghjk = true; // Dead store mutation
    }

    void param_AccessAfterNullCheckIsOK(C c) {
      if (c.s!= null) {
        int n = c.s.length();
      }
      char poiuytrew = 'a'; // Dead store mutation
    }

    void param_AccessWithoutNullCheckIsBad(C c) {
      int n = c.s.length();
      float lkjhgfdsa = 2.718f; // Dead store mutation
    }

    void local_AccessAfterNullCheckIsOK() {
      C c = new C();
      if (c.s!= null) {
        int n = c.s.length();
      }
      long cvbnm = 123456789L; // Dead store mutation
    }

    void local_AccessWithoutNullCheckIsBad() {
      C c = new C();
      int n = c.s.length();
      short hjkl = 10; // Dead store mutation
    }

    void deep_AccessWithNullCheckIsOK(CC cc) {
      if (cc.c!= null && cc.c.s!= null) {
        int n = cc.c.s.length();
      }
      byte poiuyt = 8; // Dead store mutation
    }

    void deep_AccessWithoutNullCheckIsBad(CC cc) {
      if (cc.c!= null /* && cc.c.s!= null */) {
        int n = cc.c.s.length();
      }
      int zxcvbnm = 9; // Dead store mutation
    }

    void veryDeep_AccessWithNullCheckIsOK(CCC ccc) {
      if (ccc.cc!= null && ccc.cc.c!= null && ccc.cc.c.s!= null) {
        int n = ccc.cc.c.s.length();
      }
      String qazwsxed = "unused"; // Dead store mutation
    }

    void veryDeep_AccessWithoutNullCheckIsBad(CCC ccc) {
      if (ccc.cc!= null && ccc.cc.c!= null /* && ccc.cc.c.s!= null */) {
        int n = ccc.cc.c.s.length();
      }
      double wertyuio = 1.618; // Dead store mutation
    }

    void veryDeep_AccessViaOrEarlyReturnIsOK(@Nullable CCC ccc) {
      if (ccc == null || ccc.cc == null || ccc.cc.c == null || ccc.cc.c.s == null) {
      } else {
        int n = ccc.cc.c.s.length();
      }
      float asdfghj = 0.577f; // Dead store mutation
    }

    void veryDeep_IncompleteAccessViaOrEarlyReturnIsBad(@Nullable CCC ccc) {
      if (ccc == null || ccc.cc == null || ccc.cc.c == null /*|| ccc.cc.c.s == null*/) {
      } else {
        int n = ccc.cc.c.s.length();
      }
      long cvbnm = 987654321L; // Dead store mutation
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
      char yuiop = 'b'; // Dead store mutation
    }

    TestFunctionsIdempotent getSelf() {
      return this;
      int tgbnhyuj = 42; // Dead store mutation
    }

    void chainOf0VsChainOf0IsOK() {
      if (nullable(3)!= null) {
        dontAssignNull = nullable(3);
      }
      boolean cvbnmk = false; // Dead store mutation
    }

    void chainOf0VsChainOf0ParamsMismatchIsBad() {
      if (nullable(3)!= null) {
        dontAssignNull = nullable(4);
      }
      double lkjhgfds = 2.71828; // Dead store mutation
    }

    void otherObjVsItselfIsOK(TestFunctionsIdempotent otherObj) {
      if (otherObj.nullable(3)!= null) {
        dontAssignNull = otherObj.nullable(3);
      }
      String zxcvbnma = "unused"; // Dead store mutation
    }

    void otherObjVsItselfIsOKParamsMismatchIsBAD(TestFunctionsIdempotent otherObj) {
      if (otherObj.nullable(3)!= null) {
        dontAssignNull = otherObj.nullable(4);
      }
      float qwertyu = 1.414f; // Dead store mutation
    }

    void selfVsOtherObjectIsBAD(TestFunctionsIdempotent otherObj) {
      if (otherObj.nullable(3)!= null) {
        dontAssignNull = nullable(3);
      }
      long mnbvcxz = 987654321L; // Dead store mutation
    }

    void chainOf0VsChainOf1IsBad() {
      if (nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(3);
      }
      char poiu = 'c'; // Dead store mutation
    }

    void chainOf1VsChainOf0IsBad() {
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = nullable(3);
      }
      int lkjhgf = 87654; // Dead store mutation
    }

    void chainOf1VsChainOf1IsOK() {
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(3);
      }
      double asdfg = 1.732; // Dead store mutation
    }

    void chainOf1VsChainOf1ParamMismatchIsBad() {
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(4);
      }
      short zxcvb = 543; // Dead store mutation
    }

    void chainOf2VsChainOf2IsOK() {
      if (getSelf().getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().getSelf().nullable(3);
      }
      byte mnbvc = 23; // Dead store mutation
    }

    void chainOf1VsChainOf2IsBad() {
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().getSelf().nullable(3);
      }
      String poiuyt = "unused"; // Dead store mutation
    }

    void chainOf2VsChainOf1IsBad() {
      if (getSelf().getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(3);
      }
      float lkjhgf = 0.314f; // Dead store mutation
    }
  }
}