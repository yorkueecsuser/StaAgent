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

    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This branch is intended to be reachable
      System.out.println("This branch should run if shouldRun is true.");
    } else {
      // This branch is unreachable because shouldRun will always be false
      System.out.println("This branch is unreachable.");
    }
  }

  private boolean getCondition() {
    // Always returns false to make the else branch unreachable
    return false;
  }
}