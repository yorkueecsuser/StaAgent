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
    switch (getValue()) {
      case 1:
        System.out.println("This is reachable");
        break;
      default:
        System.out.println("Default case");
        break;
    }

    // Unreachable switch statement
    if (condition) {
      int unreachableValue = getUnreachableValue();
      switch (unreachableValue) {
        case 1:
          System.out.println("This is unreachable");
          break;
        case 2:
          System.out.println("Also unreachable");
          break;
      }
    }
  }

  private static boolean getCondition() {
    return false; // This ensures the switch statement is unreachable
  }

  private static int getValue() {
    return 1; // This ensures the first switch statement is reachable
  }

  private static int getUnreachableValue() {
    return 3; // This ensures the second switch statement is unreachable
  }
}