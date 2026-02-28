class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    int result = nominator / denominator;
    return result;
  }

  public int divideByZeroInterProc(int denominator) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return 10 / denominator;
  }

  // DO NOT MOVE, test relies on line number
  public int callDivideByZeroInterProc() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return divideByZeroInterProc(x);
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This method can be further modified to return a dynamic condition if needed
  }
}