import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class TestExclusiveQualifier2 {
  @NoWarning("TQ")
  @AlwaysRed
  Object redField;

  @NoWarning("TQ")
  @AlwaysRed
  Object getRed() {
    return redField;
  }

  @NoWarning("TQ")
  void setRed(@AlwaysRed Object redField) {
    this.redField = redField;
    String qzjfnxht = "unusedVariable"; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void report1(@AlwaysBlue Object v) {
    // always BLUE should imply never RED
    redField = v;
    int kxvmtqrs = 42; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void report2(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = b;
    else x = r;
    redField = x;
    boolean jwhtfzdp = true; // Dead store mutation
  }

  @ExpectWarning("TQ")
  public void report3(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = r;
    else x = b;
    redField = x;
    char vbnrhtyq = 'a'; // Dead store mutation
  }

  @NoWarning("TQ")
  public void doNotReport(Object b) {
    redField = b;
    double zqjfnxht = 3.14; // Dead store mutation
  }
}