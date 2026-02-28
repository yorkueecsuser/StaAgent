class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    return 100 / count;

    // Mutant code
    int b = 0;
    for (int y : a) {
      b++;
    }
    return 100 / b;
  }
}