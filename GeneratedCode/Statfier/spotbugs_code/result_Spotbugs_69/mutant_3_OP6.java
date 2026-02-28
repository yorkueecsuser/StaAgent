import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;
import java.util.List;

class MutableStaticInPackage {
  @ExpectWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> LIST = Arrays.asList("a", "b");

  @NoWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> EMPTY_LIST = Arrays.asList();

  // Introduced an unreachable for loop according to the mutation operator
  public static void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This will never be printed");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}