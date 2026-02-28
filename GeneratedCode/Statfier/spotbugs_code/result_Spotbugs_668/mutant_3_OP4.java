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
    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is unreachable because whatDoIDo throws an exception
      foo = "This will never be executed";
    } else {
      // This block is also unreachable for the same reason
      foo = "This will also never be executed";
    }
    return foo;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically if needed
  }
}