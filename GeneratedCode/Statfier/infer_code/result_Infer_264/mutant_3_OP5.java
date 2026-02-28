class Break {
  /* t is also in control variables but once we have invariant analysis, it shouldn't be */
  private static int break_loop(int p, int t) {
    for (int i = 0; i < p; i++) {
      // do something
      if (t < 0) break;
      // do something
      
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch(condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This is unreachable");
          break;
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
        
        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is always false
            System.out.println("This is unreachable");
            break;
        }
      }
      i++;
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will always return false, making the switch case unreachable
  }
}