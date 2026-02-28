import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.meta.When;

class TestExclusiveQualifier {
  @ExclusiveQualifier(value = ExclusiveQualifier.Color.RED, when = When.ALWAYS)
  Object redField;

  @ExclusiveQualifier(value = ExclusiveQualifier.Color.RED, when = When.ALWAYS)
  Object getRed() {
    return redField;
  }

  void setRed(
      @ExclusiveQualifier(value = ExclusiveQualifier.Color.RED, when = When.ALWAYS)
          Object redField) {
    this.redField = redField;
  }

  @ExpectWarning("TQ")
  public void report1(
      @ExclusiveQualifier(value = ExclusiveQualifier.Color.BLUE, when = When.ALWAYS) Object v) {
    // always BLUE should imply never RED
    redField = v;

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("This is reachable.");
    } else {
      // This block is unreachable
      System.out.println("This is unreachable.");
    }
  }

  private boolean getCondition() {
    // Always returns false, making the else block unreachable
    return false;
  }
}