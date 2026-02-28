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
  boolean getCondition() {
    return false;
  }

  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This if block is unreachable
      System.out.println("This will never be printed");
    }
  }
}