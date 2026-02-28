class Break {
  /* t is also in control variables but once we have invariant analysis, it shouldn't be */
  private static int break_loop(int p, int t) {
    for (int i = 0; i < p; i++) {
      // do something
      if (t < 0) break;
      // do something
    }
    return 0;
  }

  // Mutant: Renamed 'p' to 'x'
  private static int break_loop_mutant(int x, int t) {
    for (int i = 0; i < x; i++) {
      // do something
      if (t < 0) break;
      // do something
    }
    return 0;
  }

  /* calling break_loop with a negative t should give constant
  cost. Currently, this doesn't work because parameters are removed
  when computing the env size :( */
  private static int break_constant_FP(int p) {
    return break_loop(p, -1);
  }

  // Mutant: Renamed 'p' to 'y'
  private static int break_constant_FP_mutant(int y) {
    return break_loop(y, -1);
  }

  /*
    If maxI >= 1 and maxJ >= 1 and maxI + maxJ > 8 then Infinite loop
      (but the CFG constraints never finds infinite loops)
    Otherwise, O(maxI * maxJ)
  */
  private static void break_outer_loop_MaybeInfinite(int maxI, int maxJ) {
    int i = 0;
    outerloop:
    while (i < maxI) {
      int j = 0;
      while (j < maxJ) {
        if (i + j > 10) break outerloop;
        j++;
      }
      i++;
    }
  }

  // Mutant: Renamed'maxI' to 'a' and'maxJ' to 'b'
  private static void break_outer_loop_MaybeInfinite_mutant(int a, int b) {
    int c = 0;
    mutant_outerloop:
    while (c < a) {
      int d = 0;
      while (d < b) {
        if (c + d > 10) break mutant_outerloop;
        d++;
      }
      c++;
    }
  }
}