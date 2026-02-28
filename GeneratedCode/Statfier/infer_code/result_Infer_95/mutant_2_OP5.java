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
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        int unreachableVar = 42;
        break;
    }
    return divideByZeroInterProc(0);
  }

  // divide by zero with static fields
  private static int x;

  public void setXToZero() {
    x = 0;
  }

  public int divideByZeroWithStaticField() {
    setXToZero();
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        int anotherUnreachableVar = 84;
        break;
    }
    return divideByZeroInterProc(x);
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}