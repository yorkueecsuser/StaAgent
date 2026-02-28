class Issue1498 {
  int test00(int i) {
    return i % 60 * 1000;
  }

  // Mutant for test00
  int test00_mutant(int i) {
    char a = (char) i;
    return a % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    return n;
  }

  // Mutant for test01
  int test01_mutant(int i) {
    char b = (char) i;
    int m = b % 60 * 1000;
    return m;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      ns[j] = i % 60 * 1000;
    }
    return ns;
  }

  // Mutant for test02
  int[] test02_mutant(int i) {
    int[] xs = new int[2];
    for (int k = 0; k < 2; k++) {
      xs[k] = i % 60 * 1000;
    }
    return xs;
  }
}