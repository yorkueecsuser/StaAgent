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

    // Inserting unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      x = "unreachable";
    } else {
      x = "still unreachable";
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if-else branch unreachable
  }
}