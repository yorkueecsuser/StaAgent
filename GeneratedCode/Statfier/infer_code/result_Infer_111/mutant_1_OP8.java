class InheritanceTest {
  interface MyInterface {
    public int foo();
  }

  class UniqueImpl implements MyInterface {
    public int foo() {
      return 5;
    }
  }

  public void call_interface_method_Good_FP(MyInterface x) {
    int a[] = new int[10];
    a[x.foo()] = 0;
  }

  // Mutant 1: Renaming variable 'a' to 'b'
  public void call_interface_method_Good_FP_m1(MyInterface y) {
    int b[] = new int[10];
    b[y.foo()] = 0;
  }

  public void call_interface_method_Bad(MyInterface x) {
    int a[] = new int[5];
    a[x.foo()] = 0;
  }

  // Mutant 2: Renaming variable 'a' to 'c'
  public void call_interface_method_Bad_m2(MyInterface z) {
    int c[] = new int[5];
    c[z.foo()] = 0;
  }

  interface MyInterface2 {
    public int foo();
  }

  abstract class AbsImpl implements MyInterface2 {
    public abstract int foo();
  }

  class Impl1 extends AbsImpl {
    @Override
    public int foo() {
      return 10;
    }
  }

  class Impl2 extends AbsImpl {
    @Override
    public int foo() {
      return 5;
    }
  }

  /* By heuristics, [Impl1.foo] is selected. It is hard to say good or bad. */
  public void call_interface_method2(MyInterface2 x) {
    int a[] = new int[10];
    a[x.foo()] = 0;
  }

  // Mutant 3: Renaming variable 'a' to 'd'
  public void call_interface_method2_m3(MyInterface2 w) {
    int d[] = new int[10];
    d[w.foo()] = 0;
  }
}