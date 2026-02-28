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
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable because shouldRun is always false");
    }
  }

  @NoWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public void OK(Integer port) {
    this.p = port == null? DEFAULT_PORT : port;
    this.port = port == null? DEFAULT_BOXED_PORT : port;
    this.p = port == null? DEFAULT_BOXED_PORT : port;
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable because shouldRun is always false");
    }
  }

  // Method to simulate a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}