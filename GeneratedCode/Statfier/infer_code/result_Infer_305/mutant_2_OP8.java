class Continue {
  /* Expected 1000 * 1000 / 2 */
  int continue_outer_loop_constant() {
    outer:
    for (int i = 2; i < 1000; i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) continue outer;
      }
    }
    return 0;
  }

  // Mutated code with renaming operator
  int continue_outer_loop_constant_mutated() {
    outer:
    for (int a = 2; a < 1000; a++) {
      for (int b = 2; b < a; b++) {
        if (a % b == 0) continue outer;
      }
    }
    return 0;
  }
}