import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition? 0 : 1) {
      case 0:
        // This case is unreachable because unreachableCondition is always false
        System.out.println("This will never be printed");
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
    void g() {}
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}