class Break {
  /* t is also in control variables but once we have invariant analysis, it shouldn't be */
  private static int break_loop(int p, int t) {
    for (int i = 0; i < p; i++) {
      // do something
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        // This block should never be executed
        System.out.println("This is an unreachable block");
      }
      if (t < 0) break;
      // do something
    }
    return 0;
  }

  /* calling break_loop with a negative t should give constant
  cost. Currently, this doesn't work because parameters are removed
  when computing the env size :( */
  private static int break_constant_FP(int p) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      // This block should never be executed
      System.out.println("This is an unreachable block");
    }
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
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
          // This block should never be executed
          System.out.println("This is an unreachable block");
        }
        if (i + j > 10) break outerloop;
        j++;
      }
      i++;
    }
  }

  // Method to provide a dynamic condition for the unreachable if statements
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}