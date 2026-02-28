import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    // Dead store mutation
    String qzjfnrht = "unused";
  }

  @OverridingMethodsMustInvokeSuper
  void g() {
    // Dead store mutation
    int xkvbldqp = 42;
  }

  static class SubClass extends TestOverridesSuper {
    @Override
    void f() {
      super.f();
      // Dead store mutation
      boolean jhfrtymn = false;
    }

    @Override
    void g() {
      // Dead store mutation
      double wplkjhgf = 3.14;
    }
  }
}