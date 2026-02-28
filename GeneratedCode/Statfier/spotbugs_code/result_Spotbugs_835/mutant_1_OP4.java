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

    // Inserting unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is intended to be unreachable
      count += 100;
    } else {
      // This block is also intended to be unreachable
      count -= 100;
    }

    x.f(o);
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}