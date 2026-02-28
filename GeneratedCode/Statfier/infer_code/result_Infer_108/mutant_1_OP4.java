import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Alias {
  A a, b;

  public void foo() {
    int x;
    synchronized (this) {
      a = b;
      a.f = 101;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        a.f = 202;
      } else {
        // Alternative unreachable code
        a.f = 303;
      }
    }
    x = b.f; // may_alias
  }

  public void bar(A a, A b) {
    int x;
    synchronized (this) {
      a.f = 101;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        a.f = 202;
      } else {
        // Alternative unreachable code
        a.f = 303;
      }
    }
    x = b.f; // no may_alias needed, argument treatment suffices
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

class A {
  int f = 0;
}