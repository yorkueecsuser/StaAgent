class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    int result = nominator / denominator;
    String qjvhtyxc; // Dead store
    return result;
  }

  public int divideByZeroInterProc(int denominator) {
    int zrkgfjbn; // Dead store
    return 10 / denominator;
  }

  // DO NOT MOVE, test relies on line number
  public int callDivideByZeroInterProc() {
    int wvbxmthp; // Dead store
    return divideByZeroInterProc(0);
  }

  // divide by zero with static fields
  private static int x;

  public void setXToZero() {
    x = 0;
    int lmnpqrsw; // Dead store
  }

  public int divideByZeroWithStaticField() {
    setXToZero();
    int abcdijkl; // Dead store
    return divideByZeroInterProc(x);
  }
}