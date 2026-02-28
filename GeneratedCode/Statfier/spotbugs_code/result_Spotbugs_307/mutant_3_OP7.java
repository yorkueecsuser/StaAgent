import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.concurrent.Immutable;

@Immutable
class TestImmutable2 {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Introduced an unreachable while loop as per the mutation operator
  boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      y = 10;
    }
  }
}