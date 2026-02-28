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
  static class zubClass extends TestOverridesSuper {
    @Override
    void a() {
      super.a();
    }

    @Override
    void b() {}
  }
}