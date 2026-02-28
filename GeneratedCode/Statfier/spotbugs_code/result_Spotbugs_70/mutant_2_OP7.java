import edu.umd.cs.findbugs.annotations.ExpectWarning;

class FI_EXPLICIT_INVOCATION {

  /** any can't be declared as be Object, since finalize is protected */
  @ExpectWarning("FI_EXPLICIT_INVOCATION")
  void bug(FI_EXPLICIT_INVOCATION any) throws Throwable {
    // Introduced an unreachable while loop with a dynamic condition
    boolean conditionWhile = getDynamicCondition();
    while (conditionWhile) {
      // This loop body will never be executed
      System.out.println("This is an unreachable loop body.");
    }
    
    any.finalize();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getDynamicCondition() {
    return false;
  }
}