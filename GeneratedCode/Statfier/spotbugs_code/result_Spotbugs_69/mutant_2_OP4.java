import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;
import java.util.List;

class MutableStaticInPackage {
  @ExpectWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> LIST = Arrays.asList("a", "b");

  @NoWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> EMPTY_LIST = Arrays.asList();

  // Added mutant code with an unreachable if-else statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable.");
    } else {
      // This is the unreachable branch
      System.out.println("This is unreachable.");
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is always true, making the else branch unreachable
  }
}