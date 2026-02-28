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
      } else {
        // Unreachable code
        return 88;
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
        return 77;
      } else {
        // Unreachable code
        return 66;
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
        return 55;
      } else {
        // Unreachable code
        return 33;
      }
      return 42;
    }
  }

  private boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}