class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    int result = nominator / denominator;
    String abcdefgh = "unused"; // Dead store
    return result;
  }

  public int divideByZeroInterProc(int denominator) {
    int ijklmnop = 5; // Dead store
    return 10 / denominator;
  }

  // DO NOT MOVE, test relies on line number
  public int callDivideByZeroInterProc() {
    return divideByZeroInterProc(0);
  }

  // divide by zero with static fields
  private static int x;

  public void setXToZero() {
    x = 0;
  }

  public int divideByZeroWithStaticField() {
    setXToZero();
    int opqrstuv = 42; // Dead store
    return divideByZeroInterProc(x);
  }
}