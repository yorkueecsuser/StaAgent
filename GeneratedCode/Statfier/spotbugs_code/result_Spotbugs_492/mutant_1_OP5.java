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
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition? 0 : 1 will always be 1
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public void OK(Integer port) {
    this.p = port == null? DEFAULT_PORT : port;
    this.port = port == null? DEFAULT_BOXED_PORT : port;
    this.p = port == null? DEFAULT_BOXED_PORT : port;
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 2 : 3) {
      case 2:
        // This case will never be reached because condition? 2 : 3 will always be 3
        System.out.println("This is also unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}