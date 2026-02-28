class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {

    int y = x;
    y = y - x;
    return y;
  }

  // Mutant 1: Renamed 'y' to 'z'
  public int testSelfOperation_mutant1(int x) {

    int z = x;
    z = z - x;
    return z;
  }

  int a, b;

  public int testSelfOperationField(int x) {

    a = x;
    b = a;
    b = b - a;
    return b;
  }

  // Mutant 2: Renamed 'b' to 'c'
  public int testSelfOperationField_mutant2(int x) {

    a = x;
    int c = a;
    c = c - a;
    return c;
  }
}