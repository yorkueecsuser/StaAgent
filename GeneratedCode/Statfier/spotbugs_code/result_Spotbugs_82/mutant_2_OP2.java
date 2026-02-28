import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    int x = 0; // Introduced local variable assignment
    int x1 = x; // Duplicated assignment
  }

  @OverridingMethodsMustInvokeSuper
  void g() {
    int y = 0; // Introduced local variable assignment
    int y1 = y; // Duplicated assignment
  }

  static class SubClass extends TestOverridesSuper {
    @Override
    void f() {
      super.f();
      int z = 0; // Introduced local variable assignment
      int z1 = z; // Duplicated assignment
    }

    @Override
    void g() {
      int w = 0; // Introduced local variable assignment
      int w1 = w; // Duplicated assignment
    }
  }
}