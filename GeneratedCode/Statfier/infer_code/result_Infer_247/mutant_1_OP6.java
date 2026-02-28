import codetoanalyze.java.SomeExternalClass;

class External {
  /* This function should raise deduplicated issues because the symbolic value of external method
   * should be instantiated to top. */
  void external_function_Bad(SomeExternalClass v) {
    int i = (int) (v.externalMethod1()) + 1 + (int) (v.externalMethod1()) + 1;
    
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() should return false
    }
  }

  /* This function should have no proof obligation. */
  void call_external_function_Good(SomeExternalClass v) {
    external_function_Bad(v);
  }

  // Method to provide a dynamic condition for the loop
  private boolean getCondition() {
    return false;
  }
}