import edu.umd.cs.findbugs.annotations.CheckForNull;

class InsideCatchBlock {
  public int doNotReportCatchNullPointerException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (NullPointerException e) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        return 99;
      }
      return 42;
    }
  }

  public int doNotReportCatchRuntimeException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (RuntimeException e) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        return 99;
      }
      return 42;
    }
  }

  public int doNotReportCatchException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (Exception e) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        return 99;
      }
      return 42;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }
}