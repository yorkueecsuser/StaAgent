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
        // This block is intended to be unreachable
        s = 20;
      } else {
        // Alternative block
        s = 30;
      }
    }
  }

  void incr(Foo foo, int i) {
    foo.x += i;
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      foo.x -= i;
    } else {
      // Alternative block
      foo.x += i;
    }
  }

  // calls foo which modifies global var
  void call_set_impure() {
    Foo f = new Foo();
    f.set_impure();
    boolean shouldCall = getCondition();
    if (shouldCall) {
      // This block is intended to be unreachable
      f.set_impure();
    } else {
      // Alternative block
      f.set_impure();
    }
  }

  // foo is global which is modified by incr.
  void global_mod_via_argument_passing_impure(int size, Foo f) {
    for (int i = 0; i < size; i++) {
      incr(foo, i);
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
      incr(foo, i);
    }
  }

  // aliased_foo is aliasing a global and then is modified by incr.
  void global_mod_via_argument_passing_impure_aliased(int size, Foo f) {
    Foo aliased_foo = foo; // Inferbo can't recognize aliasing here
    // and assumes aliased_foo is in [-oo,+oo] not in foo
    for (int i = 0; i < size; i++) {
      incr(aliased_foo, i);
    }
    boolean conditionElse = getCondition();
    if (conditionElse) {
      // This block is intended to be unreachable
      incr(aliased_foo, 0);
    } else {
      // Alternative block
      incr(aliased_foo, 1);
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be further modified to return true/false based on runtime logic
  }
}