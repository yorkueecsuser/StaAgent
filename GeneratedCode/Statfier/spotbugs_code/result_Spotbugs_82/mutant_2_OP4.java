import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable else block
    }
  }

  @OverridingMethodsMustInvokeSuper
  void g() {
    boolean shouldExecute = getCondition();
    if (shouldExecute) {
      // Some code
    } else {
      // Unreachable else block
    }
  }

  static class SubClass extends TestOverridesSuper {
    @Override
    void f() {
      super.f();
      boolean shouldProceed = getCondition();
      if (shouldProceed) {
        // Some code
      } else {
        // Unreachable else block
      }
    }

    @Override
    void g() {
      boolean shouldContinue = getCondition();
      if (shouldContinue) {
        // Some code
      } else {
        // Unreachable else block
      }
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the else blocks are unreachable
  }
}