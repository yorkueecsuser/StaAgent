import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;
import java.util.List;

class MutableStaticInPackage {
  @ExpectWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> LIST = Arrays.asList("a", "b");

  @NoWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> EMPTY_LIST = Arrays.asList();

  // Added mutant code with an unreachable if statement
  public static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that should run if condition is true
      System.out.println("This will run if condition is true.");
    }
    // Unreachable if statement
    boolean unreachableCondition = falseCondition();
    if (unreachableCondition) {
      // This code is unreachable
      System.out.println("This will never run.");
    }
  }

  private static boolean getCondition() {
    return true; // This can be any dynamic condition
  }

  private static boolean falseCondition() {
    return false; // This ensures the condition is always false at runtime
  }
}