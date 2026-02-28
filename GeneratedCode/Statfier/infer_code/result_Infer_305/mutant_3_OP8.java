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
  int b() {
    x:
    for (int a = 2; a < 1000; a++) {
      for (int c = 2; c < a; c++) {
        if (a % c == 0) continue x;
      }
    }
    return 0;
  }
}