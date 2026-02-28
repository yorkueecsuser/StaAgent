import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.meta.When;

class TestExhaustiveQualifier {
  @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.RED, when = When.ALWAYS)
  Object redField;

  @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.RED, when = When.NEVER)
  Object neverRedField;

  @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.BLUE, when = When.ALWAYS)
  Object blueField;

  @ExpectWarning("TQ")
  public void report1(
      @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.BLUE, when = When.ALWAYS) Object v) {
    // always BLUE should imply never RED
    redField = v;
    boolean condition = getCondition();
    if (condition) {
        // Unreachable if statement
        redField = null;
    }
  }

  @ExpectWarning("TQ")
  public void report1a(@AlwaysBlue Object v) {
    // always BLUE should imply never RED
    redField = v;
    boolean condition = getCondition();
    if (condition) {
        // Unreachable if statement
        redField = null;
    }
  }

  @NoWarning("TQ")
  public void noReport(@NeverBlue @NeverGreen Object v) {
    // no report: never blue and never green should imply always red
    redField = v;
    boolean condition = getCondition();
    if (condition) {
        // Unreachable if statement
        redField = null;
    }
  }

  @ExpectWarning("TQ")
  public void report2(@NeverBlue @NeverGreen Object v) {
    // report: never blue and never green should imply always red
    neverRedField = v;
    boolean condition = getCondition();
    if (condition) {
        // Unreachable if statement
        neverRedField = null;
    }
  }

  @ExpectWarning("TQ")
  public void report3(@NeverBlue Object v) {
    // Sanity check - should see a warning here
    blueField = v;
    boolean condition = getCondition();
    if (condition) {
        // Unreachable if statement
        blueField = null;
    }
  }

  @ExpectWarning("TQ")
  public void report4(
      @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.BLUE, when = When.NEVER) Object v) {
    // Sanity check - should see a warning here
    blueField = v;
    boolean condition = getCondition();
    if (condition) {
        // Unreachable if statement
        blueField = null;
    }
  }

  private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
  }
}