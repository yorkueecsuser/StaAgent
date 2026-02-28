class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {

    int y = x;
    y = y - x;
    return y;
  }

  // Mutant 1: Renaming variable 'y' to 'z'
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

  // Mutant 2: Renaming variable 'b' to 'c'
  int a1, c;

  public int testSelfOperationField_mutant2(int x) {

    a1 = x;
    c = a1;
    c = c - a1;
    return c;
  }
}