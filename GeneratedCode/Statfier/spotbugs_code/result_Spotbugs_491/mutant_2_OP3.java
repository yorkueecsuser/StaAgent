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

    // Mutant code: Unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      x = "unreachable";
      setFoo(x);
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}