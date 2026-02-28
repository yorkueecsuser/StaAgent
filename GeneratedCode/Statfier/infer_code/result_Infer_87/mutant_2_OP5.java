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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is reachable
        break;
    }
    // Introduced unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case true:
        // This case is unreachable
        System.out.println("This is an unreachable case");
        break;
      default:
        // This default case is unreachable
        System.out.println("This is also an unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return true;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}

class B extends A implements I {
  public void foo() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is reachable
        break;
    }
    // Introduced unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case true:
        // This case is unreachable
        System.out.println("This is an unreachable case");
        break;
      default:
        // This default case is unreachable
        System.out.println("This is also an unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return true;
  }

  private boolean getUnreachableCondition() {
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
    i.foo();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is reachable
        break;
    }
    // Introduced unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case true:
        // This case is unreachable
        System.out.println("This is an unreachable case");
        break;
      default:
        // This default case is unreachable
        System.out.println("This is also an unreachable case");
        break;
    }
  }

  @PerformanceCritical
  void reportsBecauseFooIsExpensiveInA(A a) {
    a.foo();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is reachable
        break;
    }
    // Introduced unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case true:
        // This case is unreachable
        System.out.println("This is an unreachable case");
        break;
      default:
        // This default case is unreachable
        System.out.println("This is also an unreachable case");
        break;
    }
  }

  @PerformanceCritical
  void doesNotreportBecauseFooIsNotExpensiveInB(B b) {
    b.foo();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is reachable
        break;
    }
    // Introduced unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case true:
        // This case is unreachable
        System.out.println("This is an unreachable case");
        break;
      default:
        // This default case is unreachable
        System.out.println("This is also an unreachable case");
        break;
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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is reachable
        break;
    }
    // Introduced unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case true:
        // This case is unreachable
        System.out.println("This is an unreachable case");
        break;
      default:
        // This default case is unreachable
        System.out.println("This is also an unreachable case");
        break;
    }
  }

  @PerformanceCritical
  void doesReportBecauseTypeFlowInsensitive(A a) {
    if (a instanceof B) {
      a.foo();
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is reachable
        break;
    }
    // Introduced unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case true:
        // This case is unreachable
        System.out.println("This is an unreachable case");
        break;
      default:
        // This default case is unreachable
        System.out.println("This is also an unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return true;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}