class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
    }
    return m;
  }

  static void aBad() {
    int[] a = new int[10];
    int x = max(a, 2, 2);
  }

  static void bOk() {
    int[] a = new int[10];
    int x = max(a, 2, 3);
  }

  static void cBad() {
    int[] a = new int[10];
    int x = max(a, 2, 1);
  }

  // Mutant 1: Renaming variable'm' to 'n'
  static int max1(int[] a, int i, int k) {
    int n = a[i];
    for (int j = i + 1; j < k; ++j) {
      n = Math.max(n, a[j]);
    }
    return n;
  }

  static void aBad1() {
    int[] b = new int[10];
    int y = max1(b, 2, 2);
  }

  static void bOk1() {
    int[] b = new int[10];
    int y = max1(b, 2, 3);
  }

  static void cBad1() {
    int[] b = new int[10];
    int y = max1(b, 2, 1);
  }

  // Mutant 2: Renaming variable 'a' to 'c'
  static int max2(int[] c, int i, int k) {
    int m = c[i];
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, c[j]);
    }
    return m;
  }

  static void aBad2() {
    int[] c = new int[10];
    int x = max2(c, 2, 2);
  }

  static void bOk2() {
    int[] c = new int[10];
    int x = max2(c, 2, 3);
  }

  static void cBad2() {
    int[] c = new int[10];
    int x = max2(c, 2, 1);
  }

  // Mutant 3: Renaming variable 'i' to 'p'
  static int max3(int[] a, int p, int k) {
    int m = a[p];
    for (int j = p + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
    }
    return m;
  }

  static void aBad3() {
    int[] a = new int[10];
    int x = max3(a, 2, 2);
  }

  static void bOk3() {
    int[] a = new int[10];
    int x = max3(a, 2, 3);
  }

  static void cBad3() {
    int[] a = new int[10];
    int x = max3(a, 2, 1);
  }

  // Mutant 4: Renaming variable 'k' to 'q'
  static int max4(int[] a, int i, int q) {
    int m = a[i];
    for (int j = i + 1; j < q; ++j) {
      m = Math.max(m, a[j]);
    }
    return m;
  }

  static void aBad4() {
    int[] a = new int[10];
    int x = max4(a, 2, 2);
  }

  static void bOk4() {
    int[] a = new int[10];
    int x = max4(a, 2, 3);
  }

  static void cBad4() {
    int[] a = new int[10];
    int x = max4(a, 2, 1);
  }
}