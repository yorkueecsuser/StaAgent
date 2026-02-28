import edu.umd.cs.findbugs.annotations.CheckForNull;

class InsideCatchBlock {
  public int doNotReportCatchNullPointerException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (NullPointerException e) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        return 99;
      } else {
        // This block should also never execute
        return 88;
      }
      return 42;
    }
  }

  public int doNotReportCatchRuntimeException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (RuntimeException e) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        return 77;
      } else {
        // This block should also never execute
        return 66;
      }
      return 42;
    }
  }

  public int doNotReportCatchException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (Exception e) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        return 55;
      } else {
        // This block should also never execute
        return 33;
      }
      return 42;
    }
  }

  private boolean getCondition() {
    // This method should always return false to ensure the if-else branches are unreachable
    return false;
  }
}