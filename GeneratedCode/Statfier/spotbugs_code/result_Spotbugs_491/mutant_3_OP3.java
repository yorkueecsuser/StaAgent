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

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      x = "unreachable";
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}