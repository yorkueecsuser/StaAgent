import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {}

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

  // Mutated code
  static class SubClassx extends TestOverridesSuper {
    @Override
    void a() {
      super.f();
    }

    @Override
    void b() {}
  }
}