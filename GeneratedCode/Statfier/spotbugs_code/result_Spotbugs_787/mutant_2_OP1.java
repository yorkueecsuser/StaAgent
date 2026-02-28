class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    String qvbnrhty = "unusedVariable"; // Dead store mutation
    return 100 / count;
  }
}