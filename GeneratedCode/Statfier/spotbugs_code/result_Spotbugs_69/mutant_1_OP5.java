import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;
import java.util.List;

class MutableStaticInPackage {
  @ExpectWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> LIST = Arrays.asList("a", "b");

  @NoWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> EMPTY_LIST = Arrays.asList();

  // Added mutant code with an unreachable switch statement
  public static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code here
    }

    int value = getValue();
    switch (value) {
      case 1:
        System.out.println("Case 1");
        break;
      case 2:
        System.out.println("Case 2");
        break;
      default:
        System.out.println("Default case");
        break;
    }

    // Unreachable switch statement
    int unreachableValue = getUnreachableValue();
    switch (unreachableValue) {
      case 1:
        System.out.println("This will never be printed");
        break;
      case 2:
        System.out.println("This will never be printed either");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This can be any dynamic condition
  }

  private static int getValue() {
    return 0; // This can be any dynamic value
  }

  private static int getUnreachableValue() {
    return 3; // This ensures the switch statement is unreachable
  }
}