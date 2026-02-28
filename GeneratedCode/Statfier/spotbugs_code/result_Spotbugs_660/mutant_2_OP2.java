class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {

    int y = x;
    y = y - x; // Original assignment
    y = y - x; // Duplicated assignment
    return y;
  }

  int a, b;

  public int testSelfOperationField(int x) {

    a = x; // Original assignment
    a = x; // Duplicated assignment
    b = a;
    b = b - a; // Original assignment
    b = b - a; // Duplicated assignment
    return b;
  }
}