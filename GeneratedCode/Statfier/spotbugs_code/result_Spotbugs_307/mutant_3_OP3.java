import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.concurrent.Immutable;

@Immutable
class TestImmutable2 {
  @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  final int x = 0;

  @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
  int y;

  // Inserting an unreachable if statement
  boolean getUnreachableCondition() {
    return false;
  }

  void someMethod() {
    // Original code can remain here
    y = 10;

    // Unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable statement.");
    }
  }
}