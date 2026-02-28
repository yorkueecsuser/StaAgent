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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        int unreachableVar = 10;
        System.out.println("This is unreachable: " + unreachableVar);
        break;
    }
  }

  public void call_interface_method_Bad(MyInterface x) {
    int a[] = new int[5];
    a[x.foo()] = 0;

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        int unreachableVar = 5;
        System.out.println("This is unreachable: " + unreachableVar);
        break;
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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        int unreachableVar = 7;
        System.out.println("This is unreachable: " + unreachableVar);
        break;
    }
  }

  // Helper method to simulate dynamic condition
  private boolean getCondition() {
    return false;
  }
}