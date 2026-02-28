import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import net.jcip.annotations.Immutable;

@Immutable
class TestImmutable {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Mutant code: Adding an unreachable if statement
  boolean getCondition() {
    return false;
  }

  void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      y = 10;
    }
  }
}