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

    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      x = "unreachable";
    } else {
      // This block will always execute
      x = "reachable";
    }
  }

  private boolean getCondition() {
    // Always return false to ensure the if branch is unreachable
    return false;
  }
}