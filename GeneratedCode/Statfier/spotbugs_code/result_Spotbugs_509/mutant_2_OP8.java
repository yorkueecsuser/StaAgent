import edu.umd.cs.findbugs.annotations.ExpectWarning;

class UncalledPrivateMethod {
  // Interesting tidbit:
  // Sun's javac makes class initializer methods "default static",
  // while jikes makes them "private final static", which could
  // lead to spurious warnings.
  private static final Object myObject = new Object();

  @ExpectWarning("UrF")
  String s;

  private void foo(String x) {
    this.s = x;
  }

  private void debug(String y) {
    System.out.println(y);
  }

  @ExpectWarning("UPM")
  private void foobar(int j) {}

  private void foobar(double k) {}

  public void f(double l) {
    foobar(l);
  }
}