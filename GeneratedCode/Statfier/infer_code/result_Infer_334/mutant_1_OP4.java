class Compound_loop {

  /* while loop that contains && in the guard. It gives the correct bound  */
  private static int compound_while(int m) {
    int i = 0;
    int j = 3 * i;
    while (j == 0 && i < m) {
      i++;
      // Unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        j = -1;
      } else {
        // Alternative unreachable block
        j = -2;
      }
    }
    return j;
  }

  /* p is an invariant control var. If p is 1, it runs forever */
  private static void while_and_or_top(int p) {
    int i = 0;
    while (p == 1 || (i < 30 && i >= 0)) {
      i++;
      // Unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        p = 0;
      } else {
        // Alternative unreachable block
        p = -1;
      }
    }
  }

  /* p is an invariant control var */
  private static void while_and_and_constant(int p) {
    int i = 0;
    while (p == 1 && (i < 30 && i >= 0)) {
      i++;
      // Unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because condition is always false
        p = 0;
      } else {
        // Alternative unreachable block
        p = -1;
      }
    }
  }

  // should be constant cost
  int nested_while_and_or_constant(int p) {
    int i = 0;
    int j = 3 * i;
    while (p == 1 || (i < 30 && i >= 0)) {
      while (p == 1 || (j < 5 && j >= 0)) {
        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because condition is always false
          j = -1;
        } else {
          // Alternative unreachable block
          j = -2;
        }
        return j;
      }
      i++;
    }
    return j;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}