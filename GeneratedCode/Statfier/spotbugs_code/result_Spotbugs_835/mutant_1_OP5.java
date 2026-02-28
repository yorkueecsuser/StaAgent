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

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        count += 10; // This case is unreachable
        break;
      default:
        count -= 5; // This case is also unreachable
        break;
    }

    x.f(o);
  }

  private boolean getAlwaysFalse() {
    return false; // This method ensures the switch is always unreachable
  }
}