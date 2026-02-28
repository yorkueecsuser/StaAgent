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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }

    if (c) {
      count++;
    } else {
      count--;
    }

    x.f(o);
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}