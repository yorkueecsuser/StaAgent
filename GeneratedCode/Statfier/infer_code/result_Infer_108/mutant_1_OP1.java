import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Alias {
  A a, b;

  public void foo() {
    int x;
    synchronized (this) {
      a = b;
      a.f = 101;
      // Dead store mutation
      int yqjvfnrj = 42; // Unique dead store variable
    }
    x = b.f; // may_alias
  }

  public void bar(A a, A b) {
    int x;
    synchronized (this) {
      a.f = 101;
      // Dead store mutation
      String htwzlkpi = "unused"; // Unique dead store variable
    }
    x = b.f; // no may_alias needed, argument treatment suffices
  }
}

class A {
  int f = 0;
}