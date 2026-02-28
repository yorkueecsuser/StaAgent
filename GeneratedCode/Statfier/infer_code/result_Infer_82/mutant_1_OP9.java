class Cost_test_deps {

  // Loop's execution count doesn't depend on values of p,t,k
  private static int loop_no_dep1_constant(int k) {
    int p = 0;
    int t = 2 + k;
    int i = 0;
    do {
      p++;
      i++;
    } while (i < 100);
    return p;
  }

  private static int foo_constant(int i, int j) {
    return i + j;
  }

  // Loop's execution count doesn't depend on values of p,t,k
  private static int loop_no_dep2_constant(int k) {
    int p = 0;
    int t = foo_constant(p, k);
    int i = 0;
    do {
      p++;
      i++;
    } while (i < 100);
    return p;
  }

  private static void if_constant(int j) {
    int p = 10;
    if (p < 10 + j) {
      p++;
    } else {
      p = j + 3;
      int k = 0;
      do {
        j += 3;
        k++;
      } while (k < 100);
    }
  }

  private static int if_loop_constant() {
    int p = 10;
    int j = 0;
    do {
      if (j < 2) {
        p++;
      } else {
        p = 3;
        int k = 0;
        do {
          int m = 0;
          k++;
        } while (k < 10);
      }
      j++;
    } while (j < 5);
    return p;
  }

  private static int two_loops_constant() {
    int p = 10;
    int k = 3;
    int t = 2 + k;
    int j = 0;
    do {
      k++;
      j++;
    } while (j < 6);
    int i = 0;
    do {
      p = 3;
      i++;
    } while (i < 100);
    return p;
  }

  private static int loop_despite_inferbo_constant(int p) {

    int k = 100;
    int i = 0;
    do {
      int m = p + 3;
      if (m < 14) {
        p += 9;
      }
      i++;
    } while (i < k);
    return p;
  }

  private static int nested_loop_constant() {
    int k = 0;
    int i = 0;
    do {
      A:
      k = 0;
      int j = 0;
      do {
        k = 3;
        j++;
      } while (j < 100);
      i++;
    } while (i < 5);
    return k;
  }

  private static int real_while_constant() {
    int i = 0;
    int j = 3 * i;
    do {
      j = j + i;
      i++;
    } while (i < 30);
    return j;
  }
}