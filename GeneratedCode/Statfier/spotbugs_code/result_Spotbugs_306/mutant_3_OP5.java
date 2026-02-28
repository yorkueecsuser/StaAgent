import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import net.jcip.annotations.Immutable;

@Immutable
class TestImmutable {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Added mutant code to introduce an unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some logic here
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
    // This method returns a condition that will determine the flow of the program
    return false;
  }

  private int getValue() {
    // This method returns a value that will determine the switch case
    return 0;
  }
}