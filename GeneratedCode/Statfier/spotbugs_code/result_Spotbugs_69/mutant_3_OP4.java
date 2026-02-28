import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;
import java.util.List;

class MutableStaticInPackage {
  @ExpectWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> LIST = Arrays.asList("a", "b");

  @NoWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> EMPTY_LIST = Arrays.asList();

  // Introduced an unreachable if-else statement
  public static void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable code.");
    } else {
      // This is the unreachable branch
      System.out.println("This is unreachable code due to the condition always being true.");
    }
  }

  private static boolean getCondition() {
    return true; // Ensure the condition is always true to make the else branch unreachable
  }
}