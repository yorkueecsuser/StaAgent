import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import net.jcip.annotations.Immutable;

@Immutable
class TestImmutable {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Introduced an unreachable if statement according to the mutation operator
  private boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable statement.");
    }
  }
}