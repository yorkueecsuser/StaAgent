class InheritanceTest {
  interface MyInterface {
    public void foo(int x);
  }

  class UniqueImpl implements MyInterface {
    public void foo(int x) {
      for (int i = 0; i < x; i++) {}
      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
      } else {
        // Alternative block that also will never execute
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  public void call_interface_method_linear_FN(MyInterface c, int x) {
    c.foo(x);
  }

  interface MyInterface2 {
    public void foo(int x);
  }

  abstract class AbsImpl implements MyInterface2 {
    public abstract void foo(int x);
  }

  class Impl1 extends AbsImpl {
    @Override
    public void foo(int x) {
      for (int i = 0; i < x; i++) {}
      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
      } else {
        // Alternative block that also will never execute
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  class Impl2 extends AbsImpl {
    @Override
    public void foo(int x) {}
  }

  /* As of now, we cannot find implementations of interface methods. */
  public void call_interface_method2_linear_FN(MyInterface2 c, int x) {
    c.foo(x);
  }

  interface MyInterface3 {
    public int unknown();
  }

  interface MyInterface4 {
    public void top_cost(MyInterface3 x);
  }

  class UniqueImpl4 implements MyInterface4 {
    public void top_cost(MyInterface3 i3) {
      for (int i = 0; i < i3.unknown(); i++) {}
      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
      } else {
        // Alternative block that also will never execute
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  public void ignore_top_costed_sub_method_constant(MyInterface3 i3, MyInterface4 i4) {
    i4.top_cost(i3);
  }
}