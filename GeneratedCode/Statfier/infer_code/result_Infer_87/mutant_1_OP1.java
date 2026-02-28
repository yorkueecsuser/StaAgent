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
    String qzjfnrht = "unused"; // Dead Store
  }
}

class B extends A implements I {
  public void foo() {
    int xwvfrtgb = 42; // Dead Store
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
    i.foo();
    boolean yuiopasd = false; // Dead Store
  }

  @PerformanceCritical
  void reportsBecauseFooIsExpensiveInA(A a) {
    a.foo();
    double hjklzxcv = 3.14; // Dead Store
  }

  @PerformanceCritical
  void doesNotreportBecauseFooIsNotExpensiveInB(B b) {
    b.foo();
    char nmjhgfdh = 'a'; // Dead Store
  }

  native B createB();

  A actuallyReturnsObjectOfTypeB() {
    return createB();
    float poiuytrt = 2.71f; // Dead Store
  }

  @PerformanceCritical
  void reportsAssumingObjectOfTypeA() {
    A a = actuallyReturnsObjectOfTypeB();
    a.foo();
    long wertghjk = 100L; // Dead Store
  }

  @PerformanceCritical
  void doesReportBecauseTypeFlowInsensitive(A a) {
    if (a instanceof B) {
      a.foo();
      short asdfghjk = 10; // Dead Store
    }
  }
}