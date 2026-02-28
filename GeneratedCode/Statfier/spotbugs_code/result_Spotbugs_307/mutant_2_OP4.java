import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.concurrent.Immutable;

@Immutable
class TestImmutable2 {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Introduced an unreachable if-else statement according to the mutation operator
  boolean getCondition() {
    return false;
  }

  void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute
      System.out.println("This is unreachable code.");
    } else {
      // Alternative code that will always execute
      System.out.println("This code is reachable.");
    }
  }
}