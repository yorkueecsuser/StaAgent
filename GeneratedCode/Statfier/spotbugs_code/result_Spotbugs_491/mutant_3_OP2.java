import javax.annotation.Nonnull;

class Ideas_2011_09_20 {
  Object foo;

  void setFoo(@Nonnull Object foo) {
    this.foo = foo;
  }

  void bar(boolean b) {
    Object x = null;
    if (b) x = "abc";
    // Mutated line starts here
    if (b) x = "abc"; // Duplicate of the previous assignment
    setFoo(x);
  }
}