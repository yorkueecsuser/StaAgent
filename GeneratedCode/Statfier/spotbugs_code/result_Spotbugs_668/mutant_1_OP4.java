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

  // Mutant code added here
  void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run because shouldRun is always false
      System.out.println("This is unreachable code.");
    } else {
      // Alternative code that will also never run because shouldRun is always false
      System.out.println("This is also unreachable code.");
    }
  }

  boolean getCondition() {
    // This method should always return false to ensure the if-else branches are unreachable
    return false;
  }
}