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
  private static int loop_no_dep1_constant_a(int a) {
    int b = 0;
    int c = 2 + a;
    for (int d = 0; d < 100; d++) {
      b++;
    }
    return b;
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
  private static int loop_no_dep2_constant_a(int a) {
    int b = 0;
    int c = foo_constant(b, a);
    for (int d = 0; d < 100; d++) {
      b++;
    }
    return b;
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
  private static void if_constant_a(int a) {
    int b = 10;
    if (b < 10 + a) {
      b++;
    } else {
      b = a + 3;
      for (int c = 0; c < 100; c++) {
        a += 3;
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
  private static int if_loop_constant_a() {
    int b = 10;
    for (int c = 0; c < 5; c++) {
      if (c < 2) {
        b++;
      } else {
        b = 3;
        for (int d = 0; d < 10; d++) {
          int e = 0;
        }
      }
    }
    return b;
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
  private static int two_loops_constant_a() {
    int b = 10;
    int c = 3;
    int d = 2 + c;
    for (int e = 0; e < 6; e++) {
      c++;
    }
    for (int f = 0; f < 100; f++) {
      b = 3;
    }
    return b;
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
  private static int loop_despite_inferbo_constant_a(int a) {

    int b = 100;
    for (int c = 0; c < b; c++) {
      int d = a + 3;
      if (d < 14) {
        a += 9;
      }
    }
    return a;
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
  private static int nested_loop_constant_a() {
    int b = 0;
    for (int c = 0; c < 5; c++) {
      A:
      b = 0;
      for (int d = 0; d < 100; d++) {
        b = 3;
      }
    }
    return b;
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
  private static int real_while_constant_a() {
    int b = 0;
    int c = 3 * b;
    while (b < 30) {
      c = c + b;
      b++;
    }
    return c;
  }
}