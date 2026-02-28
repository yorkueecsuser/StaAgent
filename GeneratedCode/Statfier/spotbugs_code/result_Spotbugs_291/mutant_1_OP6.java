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

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  @ExpectWarning("TQ")
  public void report2(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = b;
    else x = r;
    redField = x;

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  @ExpectWarning("TQ")
  public void report3(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = r;
    else x = b;
    redField = x;

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  @NoWarning("TQ")
  public void doNotReport(Object b) {
    redField = b;

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
  }

  // Helper method to ensure dynamic condition
  private boolean getCondition() {
    return false;
  }
}