import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.concurrent.Immutable;

@Immutable
class TestImmutable2 {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Introduced a method to determine the condition dynamically
  private boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }

  // Inserted an unreachable if-else statement
  public void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute
      System.out.println("This is unreachable code.");
    } else {
      // Alternative code
      System.out.println("This is the alternative code.");
    }
  }
}