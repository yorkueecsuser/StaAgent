class HoistUnmodeled {

  // Any unmodeled (e.g. timing) call is assumed to be modifying global
  // state
  void timing_calls_dont_hoist(int x) {
    for (int i = 0; i < x; i++) {
      System.nanoTime();
    }
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  // doesn't read from global state or call any unmodeled function, a
  // harmless pure function
  void harmless_pure() {}

  // It should be ok to hoist harmless_pure() since it doesn't read
  // from global state.
  void harmless_hoist_FN(int b) {
    for (int i = 0; i < b; i++) {
      timing_calls_dont_hoist(b); // don't hoist
      harmless_pure(); // ok to hoist
    }
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}