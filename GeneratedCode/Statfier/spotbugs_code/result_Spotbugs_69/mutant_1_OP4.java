import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;
import java.util.List;

class MutableStaticInPackage {
  @ExpectWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> LIST = Arrays.asList("a", "b");

  @NoWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> EMPTY_LIST = Arrays.asList();

  // Mutant code starts here
  public static boolean getCondition() {
    return false;
  }

  public static void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run because shouldRun is always false.");
    } else {
      System.out.println("This will always run because shouldRun is always false.");
    }
  }
}