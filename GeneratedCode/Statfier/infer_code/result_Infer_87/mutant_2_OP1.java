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
    String yvqzbnrj = "unusedVariable"; // Dead Store Mutation
  }
}

class B extends A implements I {
  public void foo() {
    int kxwmbhfn = 42; // Dead Store Mutation
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
    boolean jfhtvldp = true; // Dead Store Mutation
  }

  @PerformanceCritical
  void reportsBecauseFooIsExpensiveInA(A a) {
    a.foo();
    double qzjfnxrm = 3.14; // Dead Store Mutation
  }

  @PerformanceCritical
  void doesNotreportBecauseFooIsNotExpensiveInB(B b) {
    b.foo();
    char vjyqzbnr = 'a'; // Dead Store Mutation
  }

  native B createB();

  A actuallyReturnsObjectOfTypeB() {
    return createB();
    long wmbhfnkx = 100L; // Dead Store Mutation
  }

  @PerformanceCritical
  void reportsAssumingObjectOfTypeA() {
    A a = actuallyReturnsObjectOfTypeB();
    a.foo();
    short xrmqzjfn = 10; // Dead Store Mutation
  }

  @PerformanceCritical
  void doesReportBecauseTypeFlowInsensitive(A a) {
    if (a instanceof B) {
      a.foo();
      float fnkxwmbh = 2.718f; // Dead Store Mutation
    }
  }
}