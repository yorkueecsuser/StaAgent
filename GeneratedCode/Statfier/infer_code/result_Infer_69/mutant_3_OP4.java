class HoistUnmodeled {

  // Any unmodeled (e.g. timing) call is assumed to be modifying global
  // state
  void timing_calls_dont_hoist(int x) {
    for (int i = 0; i < x; i++) {
      System.nanoTime();
    }
    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // Alternative block that will always execute
      System.out.println("This block will always execute");
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
    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is another unreachable block");
    } else {
      // Alternative block that will always execute
      System.out.println("This block will also always execute");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}