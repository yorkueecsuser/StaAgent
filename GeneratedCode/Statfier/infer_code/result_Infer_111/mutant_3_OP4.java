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

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      a[0] = 1;
    } else {
      // Alternative code that will also never be executed
      a[1] = 2;
    }
  }

  public void call_interface_method_Bad(MyInterface x) {
    int a[] = new int[5];
    a[x.foo()] = 0;

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      a[0] = 1;
    } else {
      // Alternative code that will also never be executed
      a[1] = 2;
    }
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

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      a[0] = 1;
    } else {
      // Alternative code that will also never be executed
      a[1] = 2;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be further modified to return dynamic values if needed
  }
}