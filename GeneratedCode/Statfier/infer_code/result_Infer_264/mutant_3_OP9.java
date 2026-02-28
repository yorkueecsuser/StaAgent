class Break {
  /* t is also in control variables but once we have invariant analysis, it shouldn't be */
  private static int break_loop(int p, int t) {
    int i = 0;
    do {
      // do something
      if (t < 0) break;
      // do something
      i++;
    } while (i < p);
    return 0;
  }

  /* calling break_loop with a negative t should give constant
  cost. Currently, this doesn't work because parameters are removed
  when computing the env size :( */
  private static int break_constant_FP(int p) {
    return break_loop(p, -1);
  }

  /*
    If maxI >= 1 and maxJ >= 1 and maxI + maxJ > 8 then Infinite loop
      (but the CFG constraints never finds infinite loops)
    Otherwise, O(maxI * maxJ)
  */
  private static void break_outer_loop_MaybeInfinite(int maxI, int maxJ) {
    int i = 0;
    outerloop:
    do {
      int j = 0;
      do {
        if (i + j > 10) break outerloop;
        j++;
      } while (j < maxJ);
      i++;
    } while (i < maxI);
  }
}