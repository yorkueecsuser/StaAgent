class Cost_test_deps {

  // Loop's execution count doesn't depend on values of p,t,k
  private static int loop_no_dep1_constant(int k) {
    int p = 0;
    int t = 2 + k;
    for (int i = 0; i < 100; i++) {
      p++;
    }
    return p;
  }

  // Mutant with renamed variable
  private static int loop_no_dep1_constant_m(int k) {
    int x = 0;
    int y = 2 + k;
    for (int z = 0; z < 100; z++) {
      x++;
    }
    return x;
  }

  private static int foo_constant(int i, int j) {
    return i + j;
  }

  // Loop's execution count doesn't depend on values of p,t,k
  private static int loop_no_dep2_constant(int k) {
    int p = 0;
    int t = foo_constant(p, k);
    for (int i = 0; i < 100; i++) {
      p++;
    }
    return p;
  }

  // Mutant with renamed variable
  private static int loop_no_dep2_constant_m(int k) {
    int x = 0;
    int y = foo_constant(x, k);
    for (int z = 0; z < 100; z++) {
      x++;
    }
    return x;
  }

  private static void if_constant(int j) {
    int p = 10;
    if (p < 10 + j) {
      p++;
    } else {
      p = j + 3;
      for (int k = 0; k < 100; k++) {
        j += 3;
      }
    }
  }

  // Mutant with renamed variable
  private static void if_constant_m(int j) {
    int q = 10;
    if (q < 10 + j) {
      q++;
    } else {
      q = j + 3;
      for (int r = 0; r < 100; r++) {
        j += 3;
      }
    }
  }

  private static int if_loop_constant() {
    int p = 10;
    for (int j = 0; j < 5; j++) {
      if (j < 2) {
        p++;
      } else {
        p = 3;
        for (int k = 0; k < 10; k++) {
          int m = 0;
        }
      }
    }
    return p;
  }

  // Mutant with renamed variable
  private static int if_loop_constant_m() {
    int n = 10;
    for (int o = 0; o < 5; o++) {
      if (o < 2) {
        n++;
      } else {
        n = 3;
        for (int r = 0; r < 10; r++) {
          int s = 0;
        }
      }
    }
    return n;
  }

  private static int two_loops_constant() {
    int p = 10;
    int k = 3;
    int t = 2 + k;
    for (int j = 0; j < 6; j++) {
      k++;
    }
    for (int i = 0; i < 100; i++) {
      p = 3;
    }
    return p;
  }

  // Mutant with renamed variable
  private static int two_loops_constant_m() {
    int q = 10;
    int r = 3;
    int s = 2 + r;
    for (int t = 0; t < 6; t++) {
      r++;
    }
    for (int u = 0; u < 100; u++) {
      q = 3;
    }
    return q;
  }

  private static int loop_despite_inferbo_constant(int p) {

    int k = 100;
    for (int i = 0; i < k; i++) {
      int m = p + 3;
      if (m < 14) {
        p += 9;
      }
    }
    return p;
  }

  // Mutant with renamed variable
  private static int loop_despite_inferbo_constant_m(int p) {

    int q = 100;
    for (int r = 0; r < q; r++) {
      int s = p + 3;
      if (s < 14) {
        p += 9;
      }
    }
    return p;
  }

  private static int nested_loop_constant() {
    int k = 0;
    for (int i = 0; i < 5; i++) {
      A:
      k = 0;
      for (int j = 0; j < 100; j++) {
        k = 3;
      }
    }
    return k;
  }

  // Mutant with renamed variable
  private static int nested_loop_constant_m() {
    int l = 0;
    for (int m = 0; m < 5; m++) {
      B:
      l = 0;
      for (int n = 0; n < 100; n++) {
        l = 3;
      }
    }
    return l;
  }

  private static int real_while_constant() {
    int i = 0;
    int j = 3 * i;
    while (i < 30) {
      j = j + i;
      i++;
    }
    return j;
  }

  // Mutant with renamed variable
  private static int real_while_constant_m() {
    int x = 0;
    int y = 3 * x;
    while (x < 30) {
      y = y + x;
      x++;
    }
    return y;
  }
}