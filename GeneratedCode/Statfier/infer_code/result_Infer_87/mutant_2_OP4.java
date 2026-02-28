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
  public void foo() {}
}

class B extends A implements I {
  public void foo() {}
}

class ExpensiveInheritanceExample {

  // The objective of this test is to document the limitations of the checker, which just
  // implements a type system. This means that the checker is flow insensitive and is only based
  // on the static type information. Especially, it does not try to resolve dynamic dispatch.
  // However, the checker is still exhaustive thanks to the sub-typing rule for
  // the @Expensive annotation.
  @PerformanceCritical
  void shouldNotReportBecauseInterfaceNotAnnotated(I i) {
    i.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another code that should never run
    }
  }

  @PerformanceCritical
  void reportsBecauseFooIsExpensiveInA(A a) {
    a.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another code that should never run
    }
  }

  @PerformanceCritical
  void doesNotreportBecauseFooIsNotExpensiveInB(B b) {
    b.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another code that should never run
    }
  }

  native B createB();

  A actuallyReturnsObjectOfTypeB() {
    return createB();
  }

  @PerformanceCritical
  void reportsAssumingObjectOfTypeA() {
    A a = actuallyReturnsObjectOfTypeB();
    a.foo();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another code that should never run
    }
  }

  @PerformanceCritical
  void doesReportBecauseTypeFlowInsensitive(A a) {
    if (a instanceof B) {
      a.foo();
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
    } else {
      // Another code that should never run
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the branches are unreachable
  }
}