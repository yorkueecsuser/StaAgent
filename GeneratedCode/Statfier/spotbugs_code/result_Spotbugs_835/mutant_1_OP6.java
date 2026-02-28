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

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }

    x.f(o);
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}