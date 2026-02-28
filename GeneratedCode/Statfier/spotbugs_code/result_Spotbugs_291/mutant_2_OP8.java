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
  }

  @ExpectWarning("TQ")
  public void report1(@AlwaysBlue Object v) {
    // always BLUE should imply never RED
    redField = v;
  }

  @ExpectWarning("TQ")
  public void report2(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = b;
    else x = r;
    redField = x;
  }

  @ExpectWarning("TQ")
  public void report3(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = r;
    else x = b;
    redField = x;
  }

  @NoWarning("TQ")
  public void doNotReport(Object b) {
    redField = b;
  }

  // Mutant 1: Renaming variable 'v' to 'a'
  @ExpectWarning("TQ")
  public void report1Mutant1(@AlwaysBlue Object a) {
    // always BLUE should imply never RED
    redField = a;
  }

  // Mutant 2: Renaming variable 'b' to 'c'
  @ExpectWarning("TQ")
  public void report2Mutant1(@AlwaysBlue Object c, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = c;
    else x = r;
    redField = x;
  }

  // Mutant 3: Renaming variable 'r' to 'd'
  @ExpectWarning("TQ")
  public void report2Mutant2(@AlwaysBlue Object b, @AlwaysRed Object d, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = b;
    else x = d;
    redField = x;
  }

  // Mutant 4: Renaming variable 'x' to 'y'
  @ExpectWarning("TQ")
  public void report2Mutant3(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object y;
    if (condition) y = b;
    else y = r;
    redField = y;
  }

  // Mutant 5: Renaming variable 'b' to 'e'
  @ExpectWarning("TQ")
  public void report3Mutant1(@AlwaysBlue Object e, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = r;
    else x = e;
    redField = x;
  }

  // Mutant 6: Renaming variable 'r' to 'f'
  @ExpectWarning("TQ")
  public void report3Mutant2(@AlwaysBlue Object b, @AlwaysRed Object f, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = f;
    else x = b;
    redField = x;
  }

  // Mutant 7: Renaming variable 'x' to 'g'
  @ExpectWarning("TQ")
  public void report3Mutant3(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object g;
    if (condition) g = r;
    else g = b;
    redField = g;
  }

  // Mutant 8: Renaming variable 'b' to 'h'
  @NoWarning("TQ")
  public void doNotReportMutant1(Object h) {
    redField = h;
  }
}