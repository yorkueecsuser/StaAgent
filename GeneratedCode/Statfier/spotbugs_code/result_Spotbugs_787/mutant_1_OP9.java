class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    int i = 0;
    do {
      count++;
      i++;
    } while (i < a.length);
    return 100 / count;
  }
}