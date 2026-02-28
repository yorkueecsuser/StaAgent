class Continue {
  /* Expected 1000 * 1000 / 2 */
  int continue_outer_loop_constant() {
    outer:
    for (int i = 2; i < 1000; i++) {
      for (int j = 2; j < i; j++) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Unreachable if-else statement
          if (getUnreachableCondition()) {
            System.out.println("This is an unreachable statement");
          } else {
            System.out.println("This is also an unreachable statement");
          }
        }
        if (i % j == 0) continue outer;
      }
    }
    return 0;
  }

  private boolean getCondition() {
    return true; // This ensures the if block is executed
  }

  private boolean getUnreachableCondition() {
    return false; // This ensures the if-else block is unreachable
  }
}