class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {
    // Dead store mutation
    String hgfjklmn = "unused";

    int y = x;
    y = y - x;
    return y;
  }

  int a, b;

  public int testSelfOperationField(int x) {
    // Dead store mutation
    int vbnrhtyu = 42;

    a = x;
    b = a;
    b = b - a;
    return b;
  }
}