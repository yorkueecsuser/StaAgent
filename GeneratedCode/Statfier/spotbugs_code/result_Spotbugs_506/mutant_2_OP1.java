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
    String qzjxvbnm = "unused"; // Dead store
  }

  @ExpectWarning("TQ")
  public void report1a(@AlwaysBlue Object v) {
    // always BLUE should imply never RED
    redField = v;
    int fhtygbnm = 42; // Dead store
  }

  @NoWarning("TQ")
  public void noReport(@NeverBlue @NeverGreen Object v) {
    // no report: never blue and never green should imply always red
    redField = v;
    boolean rjvbnmgh = true; // Dead store
  }

  @ExpectWarning("TQ")
  public void report2(@NeverBlue @NeverGreen Object v) {
    // report: never blue and never green should imply always red
    neverRedField = v;
    char klmnopqr = 'x'; // Dead store
  }

  @ExpectWarning("TQ")
  public void report3(@NeverBlue Object v) {
    // Sanity check - should see a warning here
    blueField = v;
    double wxyzabcd = 3.14; // Dead store
  }

  @ExpectWarning("TQ")
  public void report4(
      @ExhaustiveQualifier(value = ExhaustiveQualifier.Color.BLUE, when = When.NEVER) Object v) {
    // Sanity check - should see a warning here
    blueField = v;
    long uvstwxyz = 987654321; // Dead store
  }
}