import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import net.jcip.annotations.Immutable;

@Immutable
class TestImmutable {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;
  final int x = 0; // Mutant: duplicated assignment of x

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;
  int y = 1; // Mutant: duplicated assignment of y with a different value to maintain uniqueness
}