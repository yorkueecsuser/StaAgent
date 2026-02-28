class Issue1498 {
  int test00(int i) {
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    int j = 0;
    do {
      ns[j] = i % 60 * 1000;
      j++;
    } while (j < 2);
    return ns;
  }
}