import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import net.jcip.annotations.Immutable;

@Immutable
class TestImmutable {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Added mutant code for Unreachable for loop
  boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
      System.out.println("This will never be printed");
    }
  }
}