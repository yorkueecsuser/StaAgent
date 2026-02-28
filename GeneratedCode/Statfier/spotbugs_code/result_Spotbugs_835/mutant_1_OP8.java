public abstract class GuaranteedDerefInterproc {
  interface I {
    int f(Object o);
  }

  static class A implements I {
    @Override
    public int f(Object o) {
      return o.hashCode();
    }
  }

  static class B implements I {
    @Override
    public int f(Object o) {
      return o.hashCode();
    }
  }

  int count;

  abstract I create();

  void report1(boolean b, boolean c) {
    I x = create();
    Object o = null;

    if (b) {
      o = new Object();
    }

    if (c) {
      count++;
    } else {
      count--;
    }

    x.f(o);
  }

  // Mutated code
  void report2(boolean d, boolean e) {
    I y = create();
    Object p = null;

    if (d) {
      p = new Object();
    }

    if (e) {
      count++;
    } else {
      count--;
    }

    y.f(p);
  }
}