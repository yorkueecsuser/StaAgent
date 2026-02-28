class Continue {
  /* Expected 1000 * 1000 / 2 */
  int continue_outer_loop_constant() {
    outer:
    for (int i = 2; i < 1000; i++) {
      for (int j = 2; j < i; j++) {
        // Introduced unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable
          System.out.println("This is an unreachable block");
        }
        if (i % j == 0) continue outer;
      }
    }
    return 0;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}