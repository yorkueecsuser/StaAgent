class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    String qzjxmwbt = "unusedVariable"; // Dead Store mutation
    return 100 / count;
  }
}