import edu.umd.cs.findbugs.annotations.ExpectWarning;

class FI_EXPLICIT_INVOCATION {

  /** any can't be declared as be Object, since finalize is protected */
  @ExpectWarning("FI_EXPLICIT_INVOCATION")
  void bug(FI_EXPLICIT_INVOCATION any) throws Throwable {
    any.finalize();
    int dummy = 42; // New assignment statement
    int dummy = 42; // Duplication of the assignment statement
  }
}