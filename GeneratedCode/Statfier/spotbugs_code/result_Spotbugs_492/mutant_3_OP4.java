import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2012_10_18 {

  static final int DEFAULT_PORT = 80;
  static final Integer DEFAULT_BOXED_PORT = 80;

  Integer port;
  int p;

  @ExpectWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public void warning(Integer port) {
    this.port = port == null? DEFAULT_PORT : port;
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      this.port = 90;
    } else {
      // This block will always execute
      this.port = port == null? DEFAULT_PORT : port;
    }
  }

  @NoWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public void OK(Integer port) {
    this.p = port == null? DEFAULT_PORT : port;
    this.port = port == null? DEFAULT_BOXED_PORT : port;
    this.p = port == null? DEFAULT_BOXED_PORT : port;
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      this.p = 90;
    } else {
      // This block will always execute
      this.p = port == null? DEFAULT_BOXED_PORT : port;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branch is unreachable
  }
}