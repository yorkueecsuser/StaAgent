import javax.annotation.Nonnull;

class Ideas_2011_09_20 {
  Object foo;

  void setFoo(@Nonnull Object foo) {
    this.foo = foo;
  }

  void bar(boolean b) {
    Object x = null;
    if (b) x = "abc";
    setFoo(x);

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        x = "unreachable";
        break;
      default:
        // This is the default case and will be executed since alwaysFalse is false
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}