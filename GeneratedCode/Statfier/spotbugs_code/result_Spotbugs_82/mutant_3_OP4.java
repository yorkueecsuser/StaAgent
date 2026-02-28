import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    } else {
      // Unreachable else block
    }
  }

  @OverridingMethodsMustInvokeSuper
  void g() {
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    } else {
      // Unreachable else block
    }
  }

  static class SubClass extends TestOverridesSuper {
    @Override
    void f() {
      super.f();
      boolean condition = getCondition();
      if (condition) {
        // Some code here
      } else {
        // Unreachable else block
      }
    }

    @Override
    void g() {
      boolean condition = getCondition();
      if (condition) {
        // Some code here
      } else {
        // Unreachable else block
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}