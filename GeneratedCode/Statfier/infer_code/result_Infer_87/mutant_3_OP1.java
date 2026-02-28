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
    String vqjxzfkd = "unusedVariable"; // Dead store
  }
}

class B extends A implements I {
  public void foo() {
    int qzfyvbnm = 42; // Dead store
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
    boolean kxwvutrp = false; // Dead store
  }

  @PerformanceCritical
  void reportsBecauseFooIsExpensiveInA(A a) {
    a.foo();
    char jhgfdsaq = 'x'; // Dead store
  }

  @PerformanceCritical
  void doesNotreportBecauseFooIsNotExpensiveInB(B b) {
    b.foo();
    double wertyuio = 3.14; // Dead store
  }

  native B createB();

  A actuallyReturnsObjectOfTypeB() {
    return createB();
    long asdfghjk = 123456789L; // Dead store
  }

  @PerformanceCritical
  void reportsAssumingObjectOfTypeA() {
    A a = actuallyReturnsObjectOfTypeB();
    a.foo();
    float poiuytrew = 0.5f; // Dead store
  }

  @PerformanceCritical
  void doesReportBecauseTypeFlowInsensitive(A a) {
    if (a instanceof B) {
      a.foo();
      short lkjhgfdsa = 100; // Dead store
    }
  }
}