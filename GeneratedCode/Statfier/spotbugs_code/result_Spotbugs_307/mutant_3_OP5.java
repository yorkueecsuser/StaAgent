import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.concurrent.Immutable;

@Immutable
class TestImmutable2 {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Added mutant code to introduce an unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some existing logic
    }

    // Unreachable switch statement
    int value = getValue();
    switch (value) {
      case 1:
        // This case will never be reached because getValue() does not return 1
        System.out.println("This is unreachable");
        break;
      default:
        // Default case
        break;
    }
  }

  private boolean getCondition() {
    // This method can return true or false, but for the purpose of making the switch unreachable, it should not return a value that makes the switch reachable
    return false;
  }

  private int getValue() {
    // This method returns a value that ensures the switch statement is unreachable
    return 0;
  }
}