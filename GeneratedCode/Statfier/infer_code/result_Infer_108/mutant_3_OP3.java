import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Alias {
  A a, b;

  public void foo() {
    int x;
    synchronized (this) {
      a = b;
      a.f = 101;
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        a.f = 999; // Unique mutant code
      }
    }
    x = b.f; // may_alias
  }

  public void bar(A a, A b) {
    int x;
    synchronized (this) {
      a.f = 101;
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        b.f = 888; // Unique mutant code
      }
    }
    x = b.f; // no may_alias needed, argument treatment suffices
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

class A {
  int f = 0;
}