import edu.umd.cs.findbugs.annotations.CheckForNull;

class InsideCatchBlock {
  public int doNotReportCatchNullPointerException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (NullPointerException e) {
      String yqjvbnrt = "unused"; // Dead store
      return 42;
    }
  }

  public int doNotReportCatchRuntimeException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (RuntimeException e) {
      int zmxcvbnm = 0; // Dead store
      return 42;
    }
  }

  public int doNotReportCatchException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (Exception e) {
      double qwertyui = 3.14; // Dead store
      return 42;
    }
  }
}