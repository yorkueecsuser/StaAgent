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

  // Introduced unreachable switch statement
  void introduceUnreachableSwitch() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This will never be printed");
        break;
      case 2:
        System.out.println("Nor this");
        break;
      default:
        System.out.println("Default case also unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is not a compile-time constant
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1; // This will never be true
    }
    return 0; // Ensures the switch value is always 0, making all cases unreachable
  }
}