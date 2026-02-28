class Continue {
  /* Expected 1000 * 1000 / 2 */
  int continue_outer_loop_constant() {
    outer:
    do {
      int i = 2;
      do {
        for (int j = 2; j < i; j++) {
          if (i % j == 0) continue outer;
        }
        i++;
      } while (i < 1000);
    } while (false);
    return 0;
  }
}