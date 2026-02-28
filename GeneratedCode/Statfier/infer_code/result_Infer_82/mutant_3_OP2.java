class Cost_test_deps {

  // Loop's execution count doesn't depend on values of p,t,k
  private static int loop_no_dep1_constant(int k) {
    int p = 0;
    int t = 2 + k;
    p = 0; // Mutation: Duplicate assignment
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
    t = foo_constant(p, k); // This line remains unchanged as per mutation operator rules
    for (int i = 0; i < 100; i++) {
      p++;
    }
    return p;
  }

  private static void if_constant(int j) {
    int p = 10;
    p = 10; // Mutation: Duplicate assignment
    if (p < 10 + j) {
      p++;
      p++; // Mutation: Duplicate assignment
    } else {
      p = j + 3;
      p = j + 3; // Mutation: Duplicate assignment
      for (int k = 0; k < 100; k++) {
        j += 3;
        j += 3; // Mutation: Duplicate assignment
      }
    }
  }

  private static int if_loop_constant() {
    int p = 10;
    p = 10; // Mutation: Duplicate assignment
    for (int j = 0; j < 5; j++) {
      if (j < 2) {
        p++;
        p++; // Mutation: Duplicate assignment
      } else {
        p = 3;
        p = 3; // Mutation: Duplicate assignment
        for (int k = 0; k < 10; k++) {
          int m = 0;
          m = 0; // Mutation: Duplicate assignment
        }
      }
    }
    return p;
  }

  private static int two_loops_constant() {
    int p = 10;
    p = 10; // Mutation: Duplicate assignment
    int k = 3;
    k = 3; // Mutation: Duplicate assignment
    int t = 2 + k;
    t = 2 + k; // Mutation: Duplicate assignment
    for (int j = 0; j < 6; j++) {
      k++;
      k++; // Mutation: Duplicate assignment
    }
    for (int i = 0; i < 100; i++) {
      p = 3;
      p = 3; // Mutation: Duplicate assignment
    }
    return p;
  }

  private static int loop_despite_inferbo_constant(int p) {

    int k = 100;
    k = 100; // Mutation: Duplicate assignment
    for (int i = 0; i < k; i++) {
      int m = p + 3;
      m = p + 3; // Mutation: Duplicate assignment
      if (m < 14) {
        p += 9;
        p += 9; // Mutation: Duplicate assignment
      }
    }
    return p;
  }

  private static int nested_loop_constant() {
    int k = 0;
    k = 0; // Mutation: Duplicate assignment
    for (int i = 0; i < 5; i++) {
      A:
      k = 0;
      k = 0; // Mutation: Duplicate assignment
      for (int j = 0; j < 100; j++) {
        k = 3;
        k = 3; // Mutation: Duplicate assignment
      }
    }
    return k;
  }

  private static int real_while_constant() {
    int i = 0;
    i = 0; // Mutation: Duplicate assignment
    int j = 3 * i;
    j = 3 * i; // Mutation: Duplicate assignment
    while (i < 30) {
      j = j + i;
      j = j + i; // Mutation: Duplicate assignment
      i++;
      i++; // Mutation: Duplicate assignment
    }
    return j;
  }
}