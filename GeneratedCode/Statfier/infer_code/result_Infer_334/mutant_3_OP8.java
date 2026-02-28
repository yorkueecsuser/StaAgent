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

  // Mutant with renamed variable 'i' to 'x'
  private static int compound_while_mutant(int m) {
    int x = 0;
    int j = 3 * x;
    while (j == 0 && x < m) {
      x++;
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

  // Mutant with renamed variable 'i' to 'y'
  private static void while_and_or_top_mutant(int p) {
    int y = 0;
    while (p == 1 || (y < 30 && y >= 0)) {
      y++;
    }
  }

  /* p is an invariant control var */
  private static void while_and_and_constant(int p) {
    int i = 0;
    while (p == 1 && (i < 30 && i >= 0)) {
      i++;
    }
  }

  // Mutant with renamed variable 'i' to 'z'
  private static void while_and_and_constant_mutant(int p) {
    int z = 0;
    while (p == 1 && (z < 30 && z >= 0)) {
      z++;
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

  // Mutant with renamed variable 'i' to 'a' and 'j' to 'b'
  int nested_while_and_or_constant_mutant(int p) {
    int a = 0;
    int b = 3 * a;
    while (p == 1 || (a < 30 && a >= 0)) {
      while (p == 1 || (b < 5 && b >= 0)) {

        return b;
      }
      a++;
    }
    return b;
  }
}