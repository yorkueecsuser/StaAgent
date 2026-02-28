import edu.umd.cs.findbugs.annotations.ExpectWarning;

class FI_EXPLICIT_INVOCATION {

  /** any can't be declared as be Object, since finalize is protected */
  @ExpectWarning("FI_EXPLICIT_INVOCATION")
  void bug(FI_EXPLICIT_INVOCATION any) throws Throwable {
    any.finalize();

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is never true
        System.out.println("This is unreachable code");
        break;
      default:
        // Default case to satisfy switch requirement
        break;
    }
  }

  private boolean getCondition() {
    // Always returns false, making the switch statement unreachable
    return false;
  }
}