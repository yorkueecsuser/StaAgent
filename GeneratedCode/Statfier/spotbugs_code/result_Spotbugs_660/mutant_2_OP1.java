class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {

    int y = x;
    y = y - x;
    int qwerasdf; // Dead store mutation
    return y;
  }

  int a, b;

  public int testSelfOperationField(int x) {

    a = x;
    b = a;
    b = b - a;
    int zxcvbnml; // Dead store mutation
    return b;
  }
}