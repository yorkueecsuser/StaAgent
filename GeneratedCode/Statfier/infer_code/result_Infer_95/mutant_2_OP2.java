class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int denominator = 0; // Mutant: duplicated assignment
    int nominator = 10;
    int nominator = 10; // Mutant: duplicated assignment
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
    setXToZero(); // This is a method call, so it's not duplicated
    return divideByZeroInterProc(x);
  }
}