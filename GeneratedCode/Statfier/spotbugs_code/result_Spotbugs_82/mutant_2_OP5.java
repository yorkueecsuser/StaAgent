import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case in f()");
        break;
    }
  }

  @OverridingMethodsMustInvokeSuper
  void g() {}

  static class SubClass extends TestOverridesSuper {
    @Override
    void f() {
      super.f();
    }

    @Override
    void g() {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("Unreachable case in g()");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}