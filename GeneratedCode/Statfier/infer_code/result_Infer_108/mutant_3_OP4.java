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

    // Inserted mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      a.f = 202;
    } else {
      // This block will always execute
      b.f = 303;
    }
  }

  public void bar(A a, A b) {
    int x;
    synchronized (this) {
      a.f = 101;
    }
    x = b.f; // no may_alias needed, argument treatment suffices

    // Inserted mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      a.f = 404;
    } else {
      // This block will always execute
      b.f = 505;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}

class A {
  int f = 0;
}