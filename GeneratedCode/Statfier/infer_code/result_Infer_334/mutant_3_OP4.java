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
        j = -1; // This will never be executed
      } else {
        j = -2; // This will also never be executed
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
        p = 0; // This will never be executed
      } else {
        p = -1; // This will also never be executed
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
        p = 0; // This will never be executed
      } else {
        p = -1; // This will also never be executed
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
          j = -1; // This will never be executed
        } else {
          j = -2; // This will also never be executed
        }
        return j;
      }
      i++;
    }
    return j;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically if needed
  }
}