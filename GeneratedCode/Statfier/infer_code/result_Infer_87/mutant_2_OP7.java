import android.annotation.SuppressLint;
import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;

interface I {
  void foo();
}

class A implements I {

  @SuppressLint("CHECKERS_EXPENSIVE_OVERRIDES_UNANNOTATED")
  // Suppressing the sub-typing violation warning here as foo() is not annotated as @Expensive
  // in the interface. This report is legit but is not relevant for the current test.
  @Expensive
  public void foo() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class B extends A implements I {
  public void foo() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class ExpensiveInheritanceExample {

  // The objective of this test is to document the limitations of the checker, which just
  // implements a type system. This means that the checker is flow insensitive and is only based
  // on the static type information. Especially, it does not try to resolve dynamic dispatch.
  // However, the checker is still exhaustive thanks to the sub-typing rule for
  // the @Expensive annotation.
  @PerformanceCritical
  void shouldNotReportBecauseInterfaceNotAnnotated(I i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    i.foo();
  }

  @PerformanceCritical
  void reportsBecauseFooIsExpensiveInA(A a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    a.foo();
  }

  @PerformanceCritical
  void doesNotreportBecauseFooIsNotExpensiveInB(B b) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    b.foo();
  }

  native B createB();

  A actuallyReturnsObjectOfTypeB() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return createB();
  }

  @PerformanceCritical
  void reportsAssumingObjectOfTypeA() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    A a = actuallyReturnsObjectOfTypeB();
    a.foo();
  }

  @PerformanceCritical
  void doesReportBecauseTypeFlowInsensitive(A a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    if (a instanceof B) {
      a.foo();
    }
  }

  private boolean getCondition() {
    return false;
  }
}