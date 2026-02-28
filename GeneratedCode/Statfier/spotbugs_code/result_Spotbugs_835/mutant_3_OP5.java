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
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("Default case, also unreachable");
        break;
    }

    x.f(o);
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the switch statement unreachable
  }
}