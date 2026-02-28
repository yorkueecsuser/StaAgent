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
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch");
    }
  }

  private void debug(String s) {
    System.out.println(s);
  }

  @ExpectWarning("UPM")
  private void foobar(int i) {}

  private void foobar(double d) {}

  public void f(double d) {
    foobar(d);
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run
    } else {
      // Unreachable else branch
      System.out.println("This is another unreachable else branch");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the else branches are unreachable
  }
}