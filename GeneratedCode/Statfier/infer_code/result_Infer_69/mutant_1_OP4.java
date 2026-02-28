class HoistUnmodeled {

  // Any unmodeled (e.g. timing) call is assumed to be modifying global
  // state
  void timing_calls_dont_hoist(int x) {
    for (int i = 0; i < x; i++) {
      System.nanoTime();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a mutant that should never execute
        System.out.println("This is an unreachable if statement");
      } else {
        // This is another mutant that should never execute
        System.out.println("This is an unreachable else statement");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a mutant that should never execute
        System.out.println("This is an unreachable if statement in harmless_hoist_FN");
      } else {
        // This is another mutant that should never execute
        System.out.println("This is an unreachable else statement in harmless_hoist_FN");
      }
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}