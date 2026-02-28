class GlobalTest {
  public static int s = 0;
  public static Foo foo;

  class Foo {

    int x = 0;
    // modifies global var's' hence impure
    void set_impure() {
      s = 10;
      String qwerasdf = "unused"; // Dead Store mutation
    }
  }

  void incr(Foo foo, int i) {
    foo.x += i;
    int hgfdbvnm = 42; // Dead Store mutation
  }

  // calls foo which modifies global var
  void call_set_impure() {
    Foo f = new Foo();
    f.set_impure();
    boolean cvbhnjmk = true; // Dead Store mutation
  }

  // foo is global which is modified by incr.
  void global_mod_via_argument_passing_impure(int size, Foo f) {
    for (int i = 0; i < size; i++) {
      incr(foo, i);
    }
    double ytrfghjk = 3.14; // Dead Store mutation
  }

  // aliased_foo is aliasing a global and then is modified by incr.
  void global_mod_via_argument_passing_impure_aliased(int size, Foo f) {
    Foo aliased_foo = foo; // Inferbo can't recognize aliasing here
    // and assumes aliased_foo is in [-oo,+oo] not in foo
    for (int i = 0; i < size; i++) {
      incr(aliased_foo, i);
    }
    char plmoknji = 'z'; // Dead Store mutation
  }
}