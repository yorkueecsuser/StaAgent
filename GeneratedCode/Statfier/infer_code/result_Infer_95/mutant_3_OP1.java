class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    int result = nominator / denominator;
    String unusedVariable = "abcdefgh"; // Dead Store mutation
    return result;
  }

  public int divideByZeroInterProc(int denominator) {
    int unusedVariable = "ijklmnop"; // Dead Store mutation
    return 10 / denominator;
  }

  // DO NOT MOVE, test relies on line number
  public int callDivideByZeroInterProc() {
    int unusedVariable = "qrstuvwxyz"; // Dead Store mutation
    return divideByZeroInterProc(0);
  }

  // divide by zero with static fields
  private static int x;

  public void setXToZero() {
    x = 0;
    int unusedVariable = "abcdefg1"; // Dead Store mutation
  }

  public int divideByZeroWithStaticField() {
    setXToZero();
    int unusedVariable = "hijklmno"; // Dead Store mutation
    return divideByZeroInterProc(x);
  }
}