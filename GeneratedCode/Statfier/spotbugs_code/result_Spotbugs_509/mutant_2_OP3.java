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
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if statement");
    }
  }

  private void debug(String s) {
    System.out.println(s);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is another unreachable if statement");
    }
  }

  @ExpectWarning("UPM")
  private void foobar(int i) {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("Yet another unreachable if statement");
    }
  }

  private void foobar(double d) {}

  public void f(double d) {
    foobar(d);
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("Unreachable if statement in public method");
    }
  }

  private boolean getCondition() {
    return false;
  }
}