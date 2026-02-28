class Continue {
  /* Expected 1000 * 1000 / 2 */
  int continue_outer_loop_constant() {
    outer:
    for (int i = 2; i < 1000; i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) continue outer;
        
        // Mutant: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() always returns false
          System.out.println("This will never be printed");
        }
      }
    }
    return 0;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}