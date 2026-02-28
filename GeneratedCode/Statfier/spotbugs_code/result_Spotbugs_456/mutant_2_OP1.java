class Issue1498 {
  int test00(int i) {
    int unusedVariable1234 = 42; // Dead store mutation
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    String unusedVariableabcd = "hello"; // Dead store mutation
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      double unusedVariablexyzw = 3.14; // Dead store mutation
      ns[j] = i % 60 * 1000;
    }
    return ns;
  }
}