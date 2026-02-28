import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.concurrent.Immutable;

@Immutable
class TestImmutable2 {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Introduced an unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // This case is reachable only if getValue(condition) returns 1
        System.out.println("Reachable case");
        break;
      case 2:
        // This case is unreachable because getValue(condition) will never return 2
        System.out.println("Unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is dynamically determined at runtime
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0; // This ensures the switch expression never evaluates to 2
    }
  }
}