class Compound_loop {

  /* while loop that contains && in the guard. It gives the correct bound  */
  private static int compound_while(int m) {
    int i = 0;
    int j = 3 * i;
    j = 3 * i; // Mutation: Duplicate assignment
    while (j == 0 && i < m) {
      i++;
      i++; // Mutation: Duplicate assignment
    }
    return j;
  }

  /* p is an invariant control var. If p is 1, it runs forever */
  private static void while_and_or_top(int p) {
    int i = 0;
    i = 0; // Mutation: Duplicate assignment
    while (p == 1 || (i < 30 && i >= 0)) {
      i++;
      i++; // Mutation: Duplicate assignment
    }
  }

  /* p is an invariant control var */
  private static void while_and_and_constant(int p) {
    int i = 0;
    i = 0; // Mutation: Duplicate assignment
    while (p == 1 && (i < 30 && i >= 0)) {
      i++;
      i++; // Mutation: Duplicate assignment
    }
  }

  // should be constant cost
  int nested_while_and_or_constant(int p) {
    int i = 0;
    int j = 3 * i;
    j = 3 * i; // Mutation: Duplicate assignment
    while (p == 1 || (i < 30 && i >= 0)) {
      while (p == 1 || (j < 5 && j >= 0)) {
        j = j; // Mutation: Duplicate assignment
        return j;
      }
      i++;
      i++; // Mutation: Duplicate assignment
    }
    return j;
  }
}