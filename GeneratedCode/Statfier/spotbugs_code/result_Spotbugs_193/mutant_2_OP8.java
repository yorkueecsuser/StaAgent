import edu.umd.cs.findbugs.annotations.CheckForNull;

class InsideCatchBlock {
  public int doNotReportCatchNullPointerException(@CheckForNull Object x) {
    try {
      return x.hashCode();
    } catch (NullPointerException e) {
      return 42;
    }
  }

  // Mutant 1: Renaming variable 'x' to 'a'
  public int doNotReportCatchNullPointerExceptionMutant1(@CheckForNull Object a) {
    try {
      return a.hashCode();
    } catch (NullPointerException e) {
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

  // Mutant 2: Renaming variable 'x' to 'b'
  public int doNotReportCatchRuntimeExceptionMutant2(@CheckForNull Object b) {
    try {
      return b.hashCode();
    } catch (RuntimeException e) {
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

  // Mutant 3: Renaming variable 'x' to 'c'
  public int doNotReportCatchExceptionMutant3(@CheckForNull Object c) {
    try {
      return c.hashCode();
    } catch (Exception e) {
      return 42;
    }
  }
}