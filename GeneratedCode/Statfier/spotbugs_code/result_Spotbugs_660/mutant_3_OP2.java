class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {

    int y = x;
    y = y - x; // Original assignment
    y = y - x; // Duplicated assignment
    return y;
  }

  int a, b;

  public int testSelfOperationField(int x) {

    a = x;
    b = a; // Original assignment
    b = a; // Duplicated assignment
    b = b - a;
    return b;
  }
}