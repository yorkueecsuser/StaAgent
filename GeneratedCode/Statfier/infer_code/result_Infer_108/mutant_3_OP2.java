import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Alias {
  A a, b;

  public void foo() {
    int x;
    synchronized (this) {
      a = b;
      a.f = 101;
      a = b; // Duplicate of a = b
    }
    x = b.f; // may_alias
  }

  public void bar(A a, A b) {
    int x;
    synchronized (this) {
      a.f = 101;
      a.f = 101; // Duplicate of a.f = 101
    }
    x = b.f; // no may_alias needed, argument treatment suffices
  }
}

class A {
  int f = 0;
}