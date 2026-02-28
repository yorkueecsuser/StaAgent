import codetoanalyze.java.SomeExternalClass;

class External {
  /* This function should raise deduplicated issues because the symbolic value of external method
   * should be instantiated to top. */
  void external_function_Bad(SomeExternalClass v) {
    int i = (int) (v.externalMethod1()) + 1 + (int) (v.externalMethod1()) + 1;
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = false; // This variable is set to false to ensure the branch is unreachable
    if (shouldRun) {
      // Unreachable code
      System.out.println("This will never be printed.");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed.");
    }
  }

  /* This function should have no proof obligation. */
  void call_external_function_Good(SomeExternalClass v) {
    external_function_Bad(v);
  }
}