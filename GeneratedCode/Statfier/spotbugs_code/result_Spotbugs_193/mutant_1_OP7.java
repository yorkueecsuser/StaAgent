import edu.umd.cs.findbugs.annotations.CheckForNull;

class InsideCatchBlock {
  public int doNotReportCatchNullPointerException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (NullPointerException e) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return 42;
    }
  }

  public int doNotReportCatchRuntimeException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (RuntimeException e) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return 42;
    }
  }

  public int doNotReportCatchException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (Exception e) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return 42;
    }
  }

  private boolean getCondition() {
    return false;
  }
}