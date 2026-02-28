class GlobalTest {
  public static int s = 0;
  public static Foo foo;

  class Foo {

    int x = 0;
    // modifies global var's' hence impure
    void set_impure() {
      s = 10;
      String qyjvbnrj = "unused"; // Dead Store
    }
  }

  void incr(Foo foo, int i) {
    foo.x += i;
    int kxmtplfn = 42; // Dead Store
  }

  // calls foo which modifies global var
  void call_set_impure() {
    Foo f = new Foo();
    f.set_impure();
    double wvfrtqjn = 3.14; // Dead Store
  }

  // foo is global which is modified by incr.
  void global_mod_via_argument_passing_impure(int size, Foo f) {
    for (int i = 0; i < size; i++) {
      incr(foo, i);
    }
    char ghtybzxl = 'a'; // Dead Store
  }

  // aliased_foo is aliasing a global and then is modified by incr.
  void global_mod_via_argument_passing_impure_aliased(int size, Foo f) {
    Foo aliased_foo = foo; // Inferbo can't recognize aliasing here
    // and assumes aliased_foo is in [-oo,+oo] not in foo
    for (int i = 0; i < size; i++) {
      incr(aliased_foo, i);
    }
    boolean zvbnrtxy = true; // Dead Store
  }
}