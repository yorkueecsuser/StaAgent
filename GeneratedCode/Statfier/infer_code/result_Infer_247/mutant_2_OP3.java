import codetoanalyze.java.SomeExternalClass;

class External {
  /* This function should raise deduplicated issues because the symbolic value of external method
   * should be instantiated to top. */
  void external_function_Bad(SomeExternalClass v) {
    int i = (int) (v.externalMethod1()) + 1 + (int) (v.externalMethod1()) + 1;
    // Introduced an unreachable if statement as per mutation operator
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
  }

  /* This function should have no proof obligation. */
  void call_external_function_Good(SomeExternalClass v) {
    external_function_Bad(v);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}