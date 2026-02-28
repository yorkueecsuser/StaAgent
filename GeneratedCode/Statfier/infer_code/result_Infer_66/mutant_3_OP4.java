class GlobalTest {
  public static int s = 0;
  public static Foo foo;

  class Foo {

    int x = 0;
    // modifies global var's' hence impure
    void set_impure() {
      s = 10;
      boolean condition = getCondition();
      if (condition) {
        // This block is intended to be unreachable
        s = 20;
      } else {
        // This block is also intended to be unreachable
        s = 30;
      }
    }
  }

  void incr(Foo foo, int i) {
    foo.x += i;
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      foo.x = 0;
    } else {
      // This block is also intended to be unreachable
      foo.x = -1;
    }
  }

  // calls foo which modifies global var
  void call_set_impure() {
    Foo f = new Foo();
    f.set_impure();
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      s = 40;
    } else {
      // This block is also intended to be unreachable
      s = 50;
    }
  }

  // foo is global which is modified by incr.
  void global_mod_via_argument_passing_impure(int size, Foo f) {
    for (int i = 0; i < size; i++) {
      incr(foo, i);
    }
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      s = 60;
    } else {
      // This block is also intended to be unreachable
      s = 70;
    }
  }

  // aliased_foo is aliasing a global and then is modified by incr.
  void global_mod_via_argument_passing_impure_aliased(int size, Foo f) {
    Foo aliased_foo = foo; // Inferbo can't recognize aliasing here
    // and assumes aliased_foo is in [-oo,+oo] not in foo
    for (int i = 0; i < size; i++) {
      incr(aliased_foo, i);
    }
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      s = 80;
    } else {
      // This block is also intended to be unreachable
      s = 90;
    }
  }

  // Method to provide a dynamic condition for unreachable blocks
  private boolean getCondition() {
    return false; // This will always return false, ensuring the blocks are unreachable
  }
}