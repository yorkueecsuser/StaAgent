import javax.annotation.OverridingMethodsMustInvokeSuper;

class TestOverridesSuper {

  @OverridingMethodsMustInvokeSuper
  void f() {
    int x = 0; // Introduced assignment statement
    int x = 0; // Duplicated assignment statement
  }

  @OverridingMethodsMustInvokeSuper
  void g() {
    int y = 1; // Introduced assignment statement
    int y = 1; // Duplicated assignment statement
  }

  static class SubClass extends TestOverridesSuper {
    @Override
    void f() {
      super.f();
      int z = 2; // Introduced assignment statement
      int z = 2; // Duplicated assignment statement
    }

    @Override
    void g() {
      int w = 3; // Introduced assignment statement
      int w = 3; // Duplicated assignment statement
    }
  }
}