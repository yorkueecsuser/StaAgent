class GlobalTest {
  public static int s = 0;
  public static Foo foo;

  class Foo {

    int x = 0;
    // modifies global var's' hence impure
    void set_impure() {
      s = 10;
    }
  }

  void incr(Foo foo, int i) {
    foo.x += i;
  }

  // calls foo which modifies global var
  void call_set_impure() {
    Foo f = new Foo();
    f.set_impure();
  }

  // foo is global which is modified by incr.
  void global_mod_via_argument_passing_impure(int size, Foo f) {
    int i = 0;
    do {
      incr(foo, i);
      i++;
    } while (i < size);
  }

  // aliased_foo is aliasing a global and then is modified by incr.
  void global_mod_via_argument_passing_impure_aliased(int size, Foo f) {
    Foo aliased_foo = foo; // Inferbo can't recognize aliasing here
    // and assumes aliased_foo is in [-oo,+oo] not in foo
    int i = 0;
    do {
      incr(aliased_foo, i);
      i++;
    } while (i < size);
  }
}