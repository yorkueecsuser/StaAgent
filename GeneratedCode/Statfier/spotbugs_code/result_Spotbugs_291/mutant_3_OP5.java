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
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because getCondition() does not return true
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("TQ")
  public void report2(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = b;
    else x = r;
    redField = x;
    
    // Introduced unreachable switch statement
    boolean conditionSwitch = getCondition();
    switch(conditionSwitch) {
      case true:
        // This case is unreachable because getCondition() does not return true
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("TQ")
  public void report3(@AlwaysBlue Object b, @AlwaysRed Object r, boolean condition) {
    // always BLUE should imply never RED
    Object x;
    if (condition) x = r;
    else x = b;
    redField = x;
    
    // Introduced unreachable switch statement
    boolean conditionSwitch = getCondition();
    switch(conditionSwitch) {
      case true:
        // This case is unreachable because getCondition() does not return true
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("TQ")
  public void doNotReport(Object b) {
    redField = b;
    
    // Introduced unreachable switch statement
    boolean conditionSwitch = getCondition();
    switch(conditionSwitch) {
      case true:
        // This case is unreachable because getCondition() does not return true
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}