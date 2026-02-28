import edu.umd.cs.findbugs.annotations.ExpectWarning;

class FI_EXPLICIT_INVOCATION {

  /** any can't be declared as be Object, since finalize is protected */
  @ExpectWarning("FI_EXPLICIT_INVOCATION")
  void bug(FI_EXPLICIT_INVOCATION any) throws Throwable {
    any.finalize();
    
    // Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}