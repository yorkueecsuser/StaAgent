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

  private static int real_while_constant() {
    int i = 0;
    int j = 3 * i;
    while (i < 30) {
      j = j + i;
      i++;
    }
    return j;
  }

  // Mutated methods with renamed variables

  // Mutant 1
  private static int loop_no_dep1_constant_mut1(int z) {
    int q = 0;
    int s = 2 + z;
    for (int n = 0; n < 100; n++) {
      q++;
    }
    return q;
  }

  // Mutant 2
  private static int loop_no_dep2_constant_mut2(int z) {
    int q = 0;
    int s = foo_constant(q, z);
    for (int n = 0; n < 100; n++) {
      q++;
    }
    return q;
  }

  // Mutant 3
  private static void if_constant_mut3(int l) {
    int r = 10;
    if (r < 10 + l) {
      r++;
    } else {
      r = l + 3;
      for (int x = 0; x < 100; x++) {
        l += 3;
      }
    }
  }

  // Mutant 4
  private static int if_loop_constant_mut4() {
    int r = 10;
    for (int l = 0; l < 5; l++) {
      if (l < 2) {
        r++;
      } else {
        r = 3;
        for (int x = 0; x < 10; x++) {
          int y = 0;
        }
      }
    }
    return r;
  }

  // Mutant 5
  private static int two_loops_constant_mut5() {
    int r = 10;
    int x = 3;
    int y = 2 + x;
    for (int l = 0; l < 6; l++) {
      x++;
    }
    for (int n = 0; n < 100; n++) {
      r = 3;
    }
    return r;
  }

  // Mutant 6
  private static int loop_despite_inferbo_constant_mut6(int r) {
    int x = 100;
    for (int n = 0; n < x; n++) {
      int y = r + 3;
      if (y < 14) {
        r += 9;
      }
    }
    return r;
  }

  // Mutant 7
  private static int nested_loop_constant_mut7() {
    int x = 0;
    for (int n = 0; n < 5; n++) {
      A:
      x = 0;
      for (int y = 0; y < 100; y++) {
        x = 3;
      }
    }
    return x;
  }

  // Mutant 8
  private static int real_while_constant_mut8() {
    int n = 0;
    int y = 3 * n;
    while (n < 30) {
      y = y + n;
      n++;
    }
    return y;
  }
}