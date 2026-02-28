class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    int result = nominator / denominator;
    return result;
  }

  // Mutated version of divByZeroLocal
  public int divByZeroLocalMutated(String t) {
    int a = 0;
    int b = 10;
    int c = b / a;
    return c;
  }

  public int divideByZeroInterProc(int denominator) {
    return 10 / denominator;
  }

  // Mutated version of divideByZeroInterProc
  public int divideByZeroInterProcMutated(int e) {
    return 10 / e;
  }

  // DO NOT MOVE, test relies on line number
  public int callDivideByZeroInterProc() {
    return divideByZeroInterProc(0);
  }

  // Mutated version of callDivideByZeroInterProc
  public int callDivideByZeroInterProcMutated() {
    return divideByZeroInterProcMutated(0);
  }

  // divide by zero with static fields
  private static int x;

  public void setXToZero() {
    x = 0;
  }

  public int divideByZeroWithStaticField() {
    setXToZero();
    return divideByZeroInterProc(x);
  }

  // Mutated version of divideByZeroWithStaticField
  public int divideByZeroWithStaticFieldMutated() {
    setXToZero();
    return divideByZeroInterProcMutated(x);
  }
}