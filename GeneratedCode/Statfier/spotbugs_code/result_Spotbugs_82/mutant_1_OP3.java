import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in f()");
    }
  }

  @OverridingMethodsMustInvokeSuper
  void g() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in g()");
    }
  }

  static class SubClass extends TestOverridesSuper {
    @Override
    void f() {
      super.f();
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in SubClass f()");
      }
    }

    @Override
    void g() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in SubClass g()");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}