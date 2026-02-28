class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    int result = nominator / denominator;
    return result;
  }

  public int divideByZeroInterProc(int denominator) {
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
    return divideByZeroInterProc(x);
  }

  // Mutated code
  public int divByZeroLocalMutant(String t) {
    int b = 0;
    int a = 10;
    int c = a / b;
    return c;
  }

  public int divideByZeroInterProcMutant(int y) {
    return 10 / y;
  }

  // DO NOT MOVE, test relies on line number
  public int callDivideByZeroInterProcMutant() {
    return divideByZeroInterProcMutant(0);
  }

  // divide by zero with static fields mutant
  private static int z;

  public void setZToZero() {
    z = 0;
  }

  public int divideByZeroWithStaticFieldMutant() {
    setZToZero();
    return divideByZeroInterProc(z);
  }
}