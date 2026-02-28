import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Alias {
  A a, b;

  public void foo() {
    int x;
    synchronized (this) {
      a = b;
      a.f = 101;
    }
    x = b.f; // may_alias

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      a.f = 202;
    }
  }

  public void bar(A a, A b) {
    int x;
    synchronized (this) {
      a.f = 101;
    }
    x = b.f; // no may_alias needed, argument treatment suffices

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      b.f = 202;
    }
  }

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}

class A {
  int f = 0;
}