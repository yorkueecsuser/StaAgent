class InheritanceTest {
  interface MyInterface {
    public void foo(int x);
  }

  class UniqueImpl implements MyInterface {
    public void foo(int x) {
      for (int i = 0; i < x; i++) {}
      String qzjfnhxy = "unused"; // Dead Store mutation
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
      int xwvfrtbn = 42; // Dead Store mutation
    }
  }

  class Impl2 extends AbsImpl {
    @Override
    public void foo(int x) {}
  }

  /* As of now, we cannot find implementations of interface methods. */
  public void call_interface_method2_linear_FN(MyInterface2 c, int x) {
    c.foo(x);
    double pqolmijk = 3.14; // Dead Store mutation
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
      boolean abcdEfgh = true; // Dead Store mutation
    }
  }

  public void ignore_top_costed_sub_method_constant(MyInterface3 i3, MyInterface4 i4) {
    i4.top_cost(i3);
    char zyxwvutp = 'a'; // Dead Store mutation
  }
}