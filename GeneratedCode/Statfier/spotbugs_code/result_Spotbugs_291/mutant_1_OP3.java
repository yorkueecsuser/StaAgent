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
    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      redField = new Object(); // This line is unreachable
    }
  }

  @ExpectWarning("TQ")
  public void report2(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = b;
    else x = r;
    redField = x;
    // Mutant: Inserting unreachable if branch
    boolean unreachableCondition = getCondition();
    if (unreachableCondition) {
      redField = b; // This line is unreachable
    }
  }

  @ExpectWarning("TQ")
  public void report3(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = r;
    else x = b;
    redField = x;
    // Mutant: Inserting unreachable if branch
    boolean anotherUnreachableCondition = getCondition();
    if (anotherUnreachableCondition) {
      redField = r; // This line is unreachable
    }
  }

  @NoWarning("TQ")
  public void doNotReport(Object b) {
    redField = b;
    // Mutant: Inserting unreachable if branch
    boolean yetAnotherUnreachableCondition = getCondition();
    if (yetAnotherUnreachableCondition) {
      redField = new Object(); // This line is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}