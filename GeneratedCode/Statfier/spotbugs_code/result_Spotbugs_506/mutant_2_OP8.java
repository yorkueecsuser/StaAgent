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
  public void report1a(@AlwaysBlue Object v) {
    // always BLUE should imply never RED
    redField = v;
  }

  @NoWarning("TQ")
  public void noReport(@NeverBlue @NeverGreen Object v) {
    // no report: never blue and never green should imply always red
    redField = v;
  }

  @ExpectWarning("TQ")
  public void report2(@NeverBlue @NeverGreen Object v) {
    // report: never blue and never green should imply always red
    neverRedField = v;
  }

  @ExpectWarning("TQ")
  public void report3(@NeverBlue Object v) {
    // Sanity check - should see a warning here
    blueField = v;
  }

  @ExpectWarning("TQ")
  public void report4(
      @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.BLUE, when = When.NEVER) Object v) {
    // Sanity check - should see a warning here
    blueField = v;
  }

  // Mutated code
  @ExpectWarning("TQ")
  public void report1b(
      @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.BLUE, when = When.ALWAYS) Object x) {
    // always BLUE should imply never RED
    redField = x;
  }

  @ExpectWarning("TQ")
  public void report1c(@AlwaysBlue Object y) {
    // always BLUE should imply never RED
    redField = y;
  }

  @NoWarning("TQ")
  public void noReportb(@NeverBlue @NeverGreen Object z) {
    // no report: never blue and never green should imply always red
    redField = z;
  }

  @ExpectWarning("TQ")
  public void report2b(@NeverBlue @NeverGreen Object a) {
    // report: never blue and never green should imply always red
    neverRedField = a;
  }

  @ExpectWarning("TQ")
  public void report3b(@NeverBlue Object b) {
    // Sanity check - should see a warning here
    blueField = b;
  }

  @ExpectWarning("TQ")
  public void report4b(
      @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.BLUE, when = When.NEVER) Object c) {
    // Sanity check - should see a warning here
    blueField = c;
  }
}