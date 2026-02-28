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
      System.out.println("This is reachable");
    }

    // Unreachable switch statement
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
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }

  private static int getValue() {
    return 0; // This method ensures the switch value is dynamically determined at runtime
  }
}