class Compound_loop {

  /* while loop that contains && in the guard. It gives the correct bound  */
  private static int compound_while(int m) {
    int i = 0;
    int j = 3 * i;
    while (j == 0 && i < m) {
      i++;
    }
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
    return j;
  }

  /* p is an invariant control var. If p is 1, it runs forever */
  private static void while_and_or_top(int p) {
    int i = 0;
    while (p == 1 || (i < 30 && i >= 0)) {
      i++;
    }
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
  }

  /* p is an invariant control var */
  private static void while_and_and_constant(int p) {
    int i = 0;
    while (p == 1 && (i < 30 && i >= 0)) {
      i++;
    }
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
  }

  // should be constant cost
  int nested_while_and_or_constant(int p) {
    int i = 0;
    int j = 3 * i;
    while (p == 1 || (i < 30 && i >= 0)) {
      while (p == 1 || (j < 5 && j >= 0)) {
        return j;
      }
      i++;
    }
    // Unreachable while loop mutation
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
    return j;
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will always return false, ensuring the loop is unreachable
  }
}