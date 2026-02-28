import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;
import java.util.List;

class MutableStaticInPackage {
  @ExpectWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> LIST = Arrays.asList("a", "b");

  @NoWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> EMPTY_LIST = Arrays.asList();

  // Inserting an unreachable for loop
  public static void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
      System.out.println("This loop should never execute");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}