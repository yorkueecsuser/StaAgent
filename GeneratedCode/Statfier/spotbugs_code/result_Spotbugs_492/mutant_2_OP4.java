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
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      this.port = 9999;
    } else {
      // This block is also intended to be unreachable
      this.port = 8888;
    }
  }

  @NoWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public void OK(Integer port) {
    this.p = port == null? DEFAULT_PORT : port;
    this.port = port == null? DEFAULT_BOXED_PORT : port;
    this.p = port == null? DEFAULT_BOXED_PORT : port;
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      this.p = 7777;
    } else {
      // This block is also intended to be unreachable
      this.p = 6666;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the branches unreachable
  }
}