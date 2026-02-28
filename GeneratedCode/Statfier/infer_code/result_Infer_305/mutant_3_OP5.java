class Continue {
  /* Expected 1000 * 1000 / 2 */
  int continue_outer_loop_constant() {
    outer:
    for (int i = 2; i < 1000; i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) continue outer;
      }
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case will never be reached because condition is not set to true
          System.out.println("This is an unreachable statement");
          break;
      }
    }
    return 0;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}