import codetoanalyze.java.SomeExternalClass;

class External {
  /* This function should raise deduplicated issues because the symbolic value of external method
   * should be instantiated to top. */
  void external_function_Bad(SomeExternalClass v) {
    int i = (int) (v.externalMethod1()) + 1 + (int) (v.externalMethod1()) + 1;
    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      int unreachableVariable = 42;
      System.out.println("This will never be printed: " + unreachableVariable);
    }
  }

  /* This function should have no proof obligation. */
  void call_external_function_Good(SomeExternalClass v) {
    external_function_Bad(v);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}