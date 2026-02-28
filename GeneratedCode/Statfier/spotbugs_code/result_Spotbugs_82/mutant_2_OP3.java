import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never be executed
      System.out.println("This is an unreachable if statement in f()");
    }
  }

  @OverridingMethodsMustInvokeSuper
  void g() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never be executed
      System.out.println("This is an unreachable if statement in g()");
    }
  }

  static class SubClass extends TestOverridesSuper {
    @Override
    void f() {
      super.f();
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never be executed
        System.out.println("This is an unreachable if statement in SubClass f()");
      }
    }

    @Override
    void g() {
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never be executed
        System.out.println("This is an unreachable if statement in SubClass g()");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}