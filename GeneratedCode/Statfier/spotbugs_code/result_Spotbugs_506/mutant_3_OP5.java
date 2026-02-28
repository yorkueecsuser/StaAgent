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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        redField = null;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void report1a(@AlwaysBlue Object v) {
    // always BLUE should imply never RED
    redField = v;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        redField = null;
        break;
    }
  }

  @NoWarning("TQ")
  public void noReport(@NeverBlue @NeverGreen Object v) {
    // no report: never blue and never green should imply always red
    redField = v;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        redField = null;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void report2(@NeverBlue @NeverGreen Object v) {
    // report: never blue and never green should imply always red
    neverRedField = v;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        neverRedField = null;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void report3(@NeverBlue Object v) {
    // Sanity check - should see a warning here
    blueField = v;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        blueField = null;
        break;
    }
  }

  @ExpectWarning("TQ")
  public void report4(
      @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.BLUE, when = When.NEVER) Object v) {
    // Sanity check - should see a warning here
    blueField = v;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        blueField = null;
        break;
    }
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return false;
  }
}