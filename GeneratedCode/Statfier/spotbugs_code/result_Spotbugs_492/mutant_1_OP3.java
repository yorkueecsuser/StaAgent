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
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      this.port = DEFAULT_PORT + 1; // This line is unreachable
    }
  }

  @NoWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public void OK(Integer port) {
    this.p = port == null? DEFAULT_PORT : port;
    this.port = port == null? DEFAULT_BOXED_PORT : port;
    this.p = port == null? DEFAULT_BOXED_PORT : port;
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      this.p = DEFAULT_BOXED_PORT + 1; // This line is unreachable
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}