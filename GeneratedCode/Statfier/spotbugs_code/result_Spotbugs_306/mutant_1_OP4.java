import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import net.jcip.annotations.Immutable;

@Immutable
class TestImmutable {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Mutant code starts here
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code
    } else {
      // Unreachable else block
      System.out.println("This is an unreachable else block");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}