class Continue {
  /* Expected 1000 * 1000 / 2 */
  int continue_outer_loop_constant() {
    outer:
    for (int i = 2; i < 1000; i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) continue outer;
      }
    }
    
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }
    
    return 0;
  }

  // Method to provide a dynamic condition that evaluates to false
  private boolean getCondition() {
    return false;
  }
}