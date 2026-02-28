import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import net.jcip.annotations.Immutable;

@Immutable
class TestImmutable {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Introduced an unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some logic here
    }

    // Unreachable switch statement
    int value = getValue();
    switch (value) {
      case 1:
        // This case is unreachable because getValue() always returns 0
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("Default case - this will never be printed either");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the if block is not executed
  }

  private int getValue() {
    return 0; // This method ensures the switch statement is unreachable
  }
}