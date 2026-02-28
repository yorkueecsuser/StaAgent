import edu.umd.cs.findbugs.annotations.CheckForNull;

class InsideCatchBlock {
  public int doNotReportCatchNullPointerException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (NullPointerException e) {
      return 42;
    }
  }

  // Mutated version of doNotReportCatchNullPointerException
  public int doNotReportCatchNullPointerException(@CheckForNull Object y) {
    try {
      return y.hashCode();
    } catch (NullPointerException a) {
      return 42;
    }
  }

  public int doNotReportCatchRuntimeException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (RuntimeException e) {
      return 42;
    }
  }

  // Mutated version of doNotReportCatchRuntimeException
  public int doNotReportCatchRuntimeException(@CheckForNull Object z) {
    try {
      return z.hashCode();
    } catch (RuntimeException b) {
      return 42;
    }
  }

  public int doNotReportCatchException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (Exception e) {
      return 42;
    }
  }

  // Mutated version of doNotReportCatchException
  public int doNotReportCatchException(@CheckForNull Object w) {
    try {
      return w.hashCode();
    } catch (Exception c) {
      return 42;
    }
  }
}