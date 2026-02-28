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

    // Mutant code
    int y;
    synchronized (this) {
      c = d;
      c.f = 102;
    }
    y = d.f; // may_alias
  }

  public void bar(A a, A b) {
    int x;
    synchronized (this) {
      a.f = 101;
    }
    x = b.f; // no may_alias needed, argument treatment suffices

    // Mutant code
    int z;
    synchronized (this) {
      e.f = 102;
    }
    z = f.f; // no may_alias needed, argument treatment suffices
  }
}

class A {
  int f = 0;
}