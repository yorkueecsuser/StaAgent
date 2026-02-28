import edu.umd.cs.findbugs.annotations.CheckForNull;

class InsideCatchBlock {
  public int doNotReportCatchNullPointerException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (NullPointerException e) {
      int result = 42;
      int resultCopy = result; // Mutant: Duplicate assignment statement
      return result;
    }
  }

  public int doNotReportCatchRuntimeException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (RuntimeException e) {
      int result = 42;
      int resultCopy = result; // Mutant: Duplicate assignment statement
      return result;
    }
  }

  public int doNotReportCatchException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (Exception e) {
      int result = 42;
      int resultCopy = result; // Mutant: Duplicate assignment statement
      return result;
    }
  }
}