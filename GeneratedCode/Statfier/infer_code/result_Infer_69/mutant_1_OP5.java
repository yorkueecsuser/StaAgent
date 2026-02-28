class HoistUnmodeled {

  // Any unmodeled (e.g. timing) call is assumed to be modifying global
  // state
  void timing_calls_dont_hoist(int x) {
    for (int i = 0; i < x; i++) {
      System.nanoTime();
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        harmless_pure();
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
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        timing_calls_dont_hoist(b);
        break;
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}