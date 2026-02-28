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
      // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
  }

  private void debug(String s) {
    System.out.println(s);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is another unreachable statement");
    }
  }

  @ExpectWarning("UPM")
  private void foobar(int i) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("Yet another unreachable statement");
    }
  }

  private void foobar(double d) {
    foobar((int)d);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("And yet another unreachable statement");
    }
  }

  public void f(double d) {
    foobar(d);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("One more unreachable statement");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the if statements are unreachable
  }
}