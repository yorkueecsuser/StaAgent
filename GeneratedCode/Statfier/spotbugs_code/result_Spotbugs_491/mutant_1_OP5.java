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
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition? 0 : 1 will always be 1
        x = "unreachable";
        break;
      case 1:
        // This is the only reachable case
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}