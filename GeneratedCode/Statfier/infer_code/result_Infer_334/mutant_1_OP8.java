class Compound_loop {

  /* while loop that contains && in the guard. It gives the correct bound  */
  private static int compound_while(int m) {
    int i = 0;
    int j = 3 * i;
    while (j == 0 && i < m) {
      i++;
    }
    return j;
  }

  // Mutant with renamed variable 'i' to 'a'
  private static int compound_while_mutant(int m) {
    int a = 0;
    int j = 3 * a;
    while (j == 0 && a < m) {
      a++;
    }
    return j;
  }

  /* p is an invariant control var. If p is 1, it runs forever */
  private static void while_and_or_top(int p) {
    int i = 0;
    while (p == 1 || (i < 30 && i >= 0)) {
      i++;
    }
  }

  // Mutant with renamed variable 'i' to 'b'
  private static void while_and_or_top_mutant(int p) {
    int b = 0;
    while (p == 1 || (b < 30 && b >= 0)) {
      b++;
    }
  }

  /* p is an invariant control var */
  private static void while_and_and_constant(int p) {
    int i = 0;
    while (p == 1 && (i < 30 && i >= 0)) {
      i++;
    }
  }

  // Mutant with renamed variable 'i' to 'c'
  private static void while_and_and_constant_mutant(int p) {
    int c = 0;
    while (p == 1 && (c < 30 && c >= 0)) {
      c++;
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
    return j;
  }

  // Mutant with renamed variable 'i' to 'd'
  int nested_while_and_or_constant_mutant(int p) {
    int d = 0;
    int j = 3 * d;
    while (p == 1 || (d < 30 && d >= 0)) {
      while (p == 1 || (j < 5 && j >= 0)) {

        return j;
      }
      d++;
    }
    return j;
  }
}