class Break {
  /* t is also in control variables but once we have invariant analysis, it shouldn't be */
  private static int break_loop(int p, int t) {
    for (int i = 0; i < p; i++) {
      // do something
      boolean shouldBreak = getCondition();
      if (t < 0 && shouldBreak) break;
      // do something
      // Unreachable if-else statement mutation
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // Unreachable code
        System.out.println("This is unreachable code.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code.");
      }
    }
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
    while (i < maxI) {
      int j = 0;
      while (j < maxJ) {
        if (i + j > 10) break outerloop;
        j++;
      }
      i++;
      // Unreachable if-else statement mutation
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // Unreachable code
        System.out.println("This is unreachable code in outer loop.");
      } else {
        // Another unreachable code
        System.out.println("This is also unreachable code in outer loop.");
      }
    }
  }

  // Method to simulate a dynamic condition
  private static boolean getCondition() {
    return false; // This can be dynamically set based on some logic
  }

  // Method to simulate a dynamic unreachable condition
  private static boolean getUnreachableCondition() {
    return false; // This can be dynamically set based on some logic
  }
}