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
    for (int i = 0; i < size; i++) {
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
  }

  // Mutated code starts here

  void incr(Foo bar, int j) {
    bar.x += j;
  }

  // calls foo which modifies global var
  void call_set_impure() {
    Foo g = new Foo();
    g.set_impure();
  }

  // foo is global which is modified by incr.
  void global_mod_via_argument_passing_impure(int z, Foo h) {
    for (int k = 0; k < z; k++) {
      incr(foo, k);
    }
  }

  // aliased_foo is aliasing a global and then is modified by incr.
  void global_mod_via_argument_passing_impure_aliased(int w, Foo m) {
    Foo n = foo; // Inferbo can't recognize aliasing here
    // and assumes n is in [-oo,+oo] not in foo
    for (int o = 0; o < w; o++) {
      incr(n, o);
    }
  }
}