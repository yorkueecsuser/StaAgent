import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.concurrent.Immutable;

@Immutable
class TestImmutable2 {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Added mutant code for Unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some existing code
    }

    // Unreachable switch statement
    int value = getValue();
    switch (value) {
      case 1:
        // This case is unreachable because getValue() never returns 1
        System.out.println("This will never be printed");
        break;
      default:
        // Default case
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined
  }

  private int getValue() {
    return 0; // This method ensures the switch value is dynamically determined
  }
}