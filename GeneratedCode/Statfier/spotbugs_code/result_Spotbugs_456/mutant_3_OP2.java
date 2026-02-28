class Issue1498 {
  int test00(int i) {
    return i % 60 * 1000;
    // Mutant: Duplicate the return statement
    int result = i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    // Mutant: Duplicate the assignment statement
    int n_duplicate = i % 60 * 1000;
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      ns[j] = i % 60 * 1000;
      // Mutant: Duplicate the assignment statement inside the loop
      int temp = i % 60 * 1000;
    }
    return ns;
  }
}