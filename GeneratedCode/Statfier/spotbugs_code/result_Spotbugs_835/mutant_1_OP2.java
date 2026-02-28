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
      o = new Object(); // Mutant: duplicated assignment
    }

    if (c) {
      count++;
      count++; // Mutant: duplicated assignment
    } else {
      count--;
      count--; // Mutant: duplicated assignment
    }

    x.f(o);
  }
}