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
  }

  @ExpectWarning("TQ")
  public void report1a(@AlwaysBlue Object x) {
    // always BLUE should imply never RED
    redField = x;
  }

  @NoWarning("TQ")
  public void noReport(@NeverBlue @NeverGreen Object y) {
    // no report: never blue and never green should imply always red
    redField = y;
  }

  @ExpectWarning("TQ")
  public void report2(@NeverBlue @NeverGreen Object z) {
    // report: never blue and never green should imply always red
    neverRedField = z;
  }

  @ExpectWarning("TQ")
  public void report3(@NeverBlue Object w) {
    // Sanity check - should see a warning here
    blueField = w;
  }

  @ExpectWarning("TQ")
  public void report4(
      @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.BLUE, when = When.NEVER) Object q) {
    // Sanity check - should see a warning here
    blueField = q;
  }
}