import edu.umd.cs.findbugs.annotations.ExpectWarning;

class FI_EXPLICIT_INVOCATION {

  /** any can't be declared as be Object, since finalize is protected */
  @ExpectWarning("FI_EXPLICIT_INVOCATION")
  void bug(FI_EXPLICIT_INVOCATION any) throws Throwable {
    any.finalize();
    
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}