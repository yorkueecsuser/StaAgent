import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Arrays;
import java.util.List;

class MutableStaticInPackage {
  @ExpectWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> LIST = Arrays.asList("a", "b");
  public static final List<String> LIST_MUTANT = Arrays.asList("a", "b"); // Mutant added here

  @NoWarning("MS_MUTABLE_COLLECTION")
  public static final List<String> EMPTY_LIST = Arrays.asList();
  public static final List<String> EMPTY_LIST_MUTANT = Arrays.asList(); // Mutant added here
}