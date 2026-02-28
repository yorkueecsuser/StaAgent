class Issue1498 {
  int test00(int i) {
    int qazwsxed = 42; // Dead store
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    String asdfghjk = "unused"; // Dead store
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      double zxcvbnml = 3.14; // Dead store
      ns[j] = i % 60 * 1000;
    }
    return ns;
  }
}