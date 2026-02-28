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
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable
      redField = new Object();
    }
  }

  @ExpectWarning("TQ")
  public void report2(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = b;
    else x = r;
    redField = x;
    // Introduced unreachable if statement
    boolean condition2 = getCondition();
    if (condition2) {
      // This block is unreachable
      redField = new Object();
    }
  }

  @ExpectWarning("TQ")
  public void report3(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = r;
    else x = b;
    redField = x;
    // Introduced unreachable if statement
    boolean condition3 = getCondition();
    if (condition3) {
      // This block is unreachable
      redField = new Object();
    }
  }

  @NoWarning("TQ")
  public void doNotReport(Object b) {
    redField = b;
    // Introduced unreachable if statement
    boolean condition4 = getCondition();
    if (condition4) {
      // This block is unreachable
      redField = new Object();
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be further modified to return dynamic values
  }
}