import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    // Dead store mutation
    String qvbnrhty = "unused";
  }

  @OverridingMethodsMustInvokeSuper
  void g() {
    // Dead store mutation
    int xkflmnpz = 42;
  }

  static class SubClass extends TestOverridesSuper {
    @Override
    void f() {
      super.f();
      // Dead store mutation
      boolean jwrgfhty = false;
    }

    @Override
    void g() {
      // Dead store mutation
      double plmkjuyt = 3.14;
    }
  }
}