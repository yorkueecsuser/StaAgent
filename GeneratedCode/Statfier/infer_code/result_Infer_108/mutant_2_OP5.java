import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Alias {
  A a, b;

  public void foo() {
    int x;
    synchronized (this) {
      a = b;
      a.f = 101;
      
      // Unreachable switch statement
      boolean condition = getCondition();
      switch(condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          x = 999;
          break;
      }
    }
    x = b.f; // may_alias
  }

  public void bar(A a, A b) {
    int x;
    synchronized (this) {
      a.f = 101;
      
      // Unreachable switch statement
      boolean condition = getCondition();
      switch(condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          x = 888;
          break;
      }
    }
    x = b.f; // no may_alias needed, argument treatment suffices
  }

  private boolean getCondition() {
    return false;
  }
}

class A {
  int f = 0;
}