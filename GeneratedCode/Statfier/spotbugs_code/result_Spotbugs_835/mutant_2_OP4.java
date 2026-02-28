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

    // Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      System.out.println("This is an unreachable block");
    } else {
      // This block should also never execute
      System.out.println("This is another unreachable block");
    }

    x.f(o);
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}