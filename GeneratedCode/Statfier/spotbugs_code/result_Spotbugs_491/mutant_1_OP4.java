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

    // Mutant code start
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      x = "unreachable";
    } else {
      x = "also_unreachable";
    }
    // Mutant code end
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if-else block unreachable
  }
}