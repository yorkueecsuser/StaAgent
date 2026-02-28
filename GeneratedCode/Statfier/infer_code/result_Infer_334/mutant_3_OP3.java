class Compound_loop {

  /* while loop that contains && in the guard. It gives the correct bound  */
  private static int compound_while(int m) {
    int i = 0;
    int j = 3 * i;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This is an unreachable if statement
      j = -1;
    }
    while (j == 0 && i < m) {
      i++;
    }
    return j;
  }

  /* p is an invariant control var. If p is 1, it runs forever */
  private static void while_and_or_top(int p) {
    int i = 0;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This is an unreachable if statement
      i = -1;
    }
    while (p == 1 || (i < 30 && i >= 0)) {
      i++;
    }
  }

  /* p is an invariant control var */
  private static void while_and_and_constant(int p) {
    int i = 0;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This is an unreachable if statement
      i = -1;
    }
    while (p == 1 && (i < 30 && i >= 0)) {
      i++;
    }
  }

  // should be constant cost
  int nested_while_and_or_constant(int p) {
    int i = 0;
    int j = 3 * i;
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This is an unreachable if statement
      j = -1;
    }
    while (p == 1 || (i < 30 && i >= 0)) {
      while (p == 1 || (j < 5 && j >= 0)) {
        boolean innerUnreachableCondition = getInnerUnreachableCondition();
        if (innerUnreachableCondition) {
          // This is an unreachable if statement
          j = -2;
        }
        return j;
      }
      i++;
    }
    return j;
  }

  // Helper methods to provide dynamic conditions for unreachable if statements
  private static boolean getUnreachableCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }

  private static boolean getInnerUnreachableCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}