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
    }

    void field_AccessAfterNullCheckIsOK() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (s!= null) {
        int n = s.length();
      }
    }

    void field_AccessWithoutNullCheckIsBad() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      int n = s.length();
    }

    void nestedField_AccessAfterNullCheckIsOK() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (myc.s!= null) {
        int n = myc.s.length();
      }
    }

    void nestedField_AccessWithoutNullCheckIsBad() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      int n = myc.s.length();
    }

    void param_AccessAfterNullCheckIsOK(C c) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (c.s!= null) {
        int n = c.s.length();
      }
    }

    void param_AccessWithoutNullCheckIsBad(C c) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      int n = c.s.length();
    }

    void local_AccessAfterNullCheckIsOK() {
      C c = new C();
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (c.s!= null) {
        int n = c.s.length();
      }
    }

    void local_AccessWithoutNullCheckIsBad() {
      C c = new C();
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      int n = c.s.length();
    }

    void deep_AccessWithNullCheckIsOK(CC cc) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (cc.c!= null && cc.c.s!= null) {
        int n = cc.c.s.length();
      }
    }

    void deep_AccessWithoutNullCheckIsBad(CC cc) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (cc.c!= null /* && cc.c.s!= null */) {
        int n = cc.c.s.length();
      }
    }

    void veryDeep_AccessWithNullCheckIsOK(CCC ccc) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (ccc.cc!= null && ccc.cc.c!= null && ccc.cc.c.s!= null) {
        int n = ccc.cc.c.s.length();
      }
    }

    void veryDeep_AccessWithoutNullCheckIsBad(CCC ccc) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (ccc.cc!= null && ccc.cc.c!= null /* && ccc.cc.c.s!= null */) {
        int n = ccc.cc.c.s.length();
      }
    }

    void veryDeep_AccessViaOrEarlyReturnIsOK(@Nullable CCC ccc) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (ccc == null || ccc.cc == null || ccc.cc.c == null || ccc.cc.c.s == null) {
      } else {
        int n = ccc.cc.c.s.length();
      }
    }

    void veryDeep_IncompleteAccessViaOrEarlyReturnIsBad(@Nullable CCC ccc) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (ccc == null || ccc.cc == null || ccc.cc.c == null /*|| ccc.cc.c.s == null*/) {
      } else {
        int n = ccc.cc.c.s.length();
      }
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
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (nullable(3)!= null) {
        dontAssignNull = nullable(3);
      }
    }

    void chainOf0VsChainOf0ParamsMismatchIsBad() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (nullable(3)!= null) {
        dontAssignNull = nullable(4);
      }
    }

    void otherObjVsItselfIsOK(TestFunctionsIdempotent otherObj) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (otherObj.nullable(3)!= null) {
        dontAssignNull = otherObj.nullable(3);
      }
    }

    void otherObjVsItselfIsOKParamsMismatchIsBAD(TestFunctionsIdempotent otherObj) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (otherObj.nullable(3)!= null) {
        dontAssignNull = otherObj.nullable(4);
      }
    }

    void selfVsOtherObjectIsBAD(TestFunctionsIdempotent otherObj) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (otherObj.nullable(3)!= null) {
        dontAssignNull = nullable(3);
      }
    }

    void chainOf0VsChainOf1IsBad() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(3);
      }
    }

    void chainOf1VsChainOf0IsBad() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = nullable(3);
      }
    }

    void chainOf1VsChainOf1IsOK() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(3);
      }
    }

    void chainOf1VsChainOf1ParamMismatchIsBad() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(4);
      }
    }

    void chainOf2VsChainOf2IsOK() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (getSelf().getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().getSelf().nullable(3);
      }
    }

    void chainOf1VsChainOf2IsBad() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().getSelf().nullable(3);
      }
    }

    void chainOf2VsChainOf1IsBad() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      if (getSelf().getSelf().nullable(3)!= null) {
        dontAssignNull = getSelf().nullable(3);
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}