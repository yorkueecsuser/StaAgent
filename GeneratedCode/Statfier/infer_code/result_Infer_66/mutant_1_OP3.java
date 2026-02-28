class GlobalTest {
  public static int s = 0;
  public static Foo foo;

  class Foo {

    int x = 0;
    // modifies global var's' hence impure
    void set_impure() {
      s = 10;
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        s = 20; // This line will never be executed
      }
    }
  }

  void incr(Foo foo, int i) {
    foo.x += i;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      foo.x = 0; // This line will never be executed
    }
  }

  // calls foo which modifies global var
  void call_set_impure() {
    Foo f = new Foo();
    f.set_impure();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      s = 30; // This line will never be executed
    }
  }

  // foo is global which is modified by incr.
  void global_mod_via_argument_passing_impure(int size, Foo f) {
    for (int i = 0; i < size; i++) {
      incr(foo, i);
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      size = 0; // This line will never be executed
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
    if (condition) { // Unreachable if statement
      aliased_foo.x = 0; // This line will never be executed
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if statements unreachable
  }
}