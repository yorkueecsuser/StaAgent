import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    String qazwsxed = "unusedVariable"; // Dead Store mutation
  }

  @OverridingMethodsMustInvokeSuper
  void g() {}

  static class SubClass extends TestOverridesSuper {
    @Override
    void f() {
      super.f();
      int vfrtgbhn = 42; // Dead Store mutation
    }

    @Override
    void g() {
      boolean jklpoiuy = true; // Dead Store mutation
    }
  }
}