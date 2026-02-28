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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block");
    }
  }

  private void debug(String s) {
    System.out.println(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Unreachable else block
      System.out.println("This is another unreachable else block");
    }
  }

  @ExpectWarning("UPM")
  private void foobar(int i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Unreachable else block
      System.out.println("Unreachable else block in foobar(int)");
    }
  }

  private void foobar(double d) {
    foobar(d);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Unreachable else block
      System.out.println("Unreachable else block in foobar(double)");
    }
  }

  public void f(double d) {
    foobar(d);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Unreachable else block
      System.out.println("Unreachable else block in f(double)");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the else block is unreachable
  }
}