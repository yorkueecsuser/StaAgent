import edu.umd.cs.findbugs.annotations.ExpectWarning;

class UncalledPrivateMethod {
  // Interesting tidbit:
  // Sun's javac makes class initializer methods "default static",
  // while jikes makes them "private final static", which could
  // lead to spurious warnings.
  private static final Object myObject = new Object();

  @ExpectWarning("UrF")
  String s;

  private void foo(String s) {
    this.s = s;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void debug(String s) {
    System.out.println(s);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @ExpectWarning("UPM")
  private void foobar(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private void foobar(double d) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void f(double d) {
    foobar(d);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}