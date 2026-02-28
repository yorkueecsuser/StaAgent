class Continue {
  /* Expected 1000 * 1000 / 2 */
  int continue_outer_loop_constant() {
    outer:
    for (int i = 2; i < 1000; i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) continue outer;
      }
      // Mutant: Inserting an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is unreachable because shouldRun is never set to true
        System.out.println("This is an unreachable block");
      } else {
        // This block is also unreachable because shouldRun is never set to true
        System.out.println("This is another unreachable block");
      }
    }
    return 0;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the blocks remain unreachable
  }
}