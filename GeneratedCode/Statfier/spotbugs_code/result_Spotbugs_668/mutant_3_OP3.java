import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Date;

class Ideas_2008_11_21 {

  void whatDoIDo(String reason) {
    throw new RuntimeException(reason);
  }

  static final int FOO = 17;

  int flags;

  boolean isFoo() {
    return (flags & FOO)!= 0;
  }

  @ExpectWarning("BSHIFT")
  boolean testShift(int x) {
    return x == x >>> 32;
  }

  String testDeadStorePastUnconditionalThrower() {
    String foo = new Date().toString();
    whatDoIDo("huh");
    return foo;
  }

  // Added mutant with an unreachable if statement
  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("This is reachable.");
    }
    // Unreachable if statement
    if (!condition && condition) {
      // This block is unreachable
      System.out.println("This is unreachable.");
    }
  }

  private boolean getCondition() {
    return true; // Always returns true to ensure the first if block is reachable
  }
}