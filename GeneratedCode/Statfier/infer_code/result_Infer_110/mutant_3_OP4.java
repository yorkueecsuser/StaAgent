class GlobalTest {
  public static int s = 0;
  public static Foo foo;

  class Foo {

    int x = 0;
    // modifies global var's' hence impure
    void set_impure() {
      s = 10;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable based on the dynamic condition
      } else {
        // This block is unreachable if shouldRun is always true
      }
    }
  }

  void incr(Foo foo, int i) {
    foo.x += i;
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is reachable based on the dynamic condition
      if (j >= 1) {
        conditionFor = false; // Exit the loop after one iteration
      }
    }
  }

  // calls foo which modifies global var
  void call_set_impure() {
    Foo f = new Foo();
    f.set_impure();
    boolean shouldRunElse = getCondition();
    if (shouldRunElse) {
      // This block is reachable based on the dynamic condition
    } else {
      // This block is unreachable if shouldRunElse is always true
    }
  }

  // foo is global which is modified by incr.
  void global_mod_via_argument_passing_impure(int size, Foo f) {
    for (int i = 0; i < size; i++) {
      incr(foo, i);
    }
    boolean shouldRunWhile = getCondition();
    while (shouldRunWhile) {
      // This loop is reachable based on the dynamic condition
      shouldRunWhile = false; // Exit the loop after one iteration
    }
  }

  // aliased_foo is aliasing a global and then is modified by incr.
  void global_mod_via_argument_passing_impure_aliased(int size, Foo f) {
    Foo aliased_foo = foo; // Inferbo can't recognize aliasing here
    // and assumes aliased_foo is in [-oo,+oo] not in foo
    for (int i = 0; i < size; i++) {
      incr(aliased_foo, i);
    }
    boolean shouldRunSwitch = getCondition();
    switch (shouldRunSwitch? 1 : 0) {
      case 1:
        // This block is reachable based on the dynamic condition
        break;
      case 0:
        // This block is unreachable if shouldRunSwitch is always true
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return true; // This can be adjusted to test different scenarios
  }
}