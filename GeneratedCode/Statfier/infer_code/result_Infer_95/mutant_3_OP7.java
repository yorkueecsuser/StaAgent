class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
    int result = nominator / denominator;
    return result;
  }

  public int divideByZeroInterProc(int denominator) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
    }
    return 10 / denominator;
  }

  // DO NOT MOVE, test relies on line number
  public int callDivideByZeroInterProc() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { 
      // Unreachable while loop
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
      // Unreachable while loop
    }
    return divideByZeroInterProc(x);
  }

  private boolean getCondition() {
    return false; // This method returns false, but it is dynamically determined at runtime
  }
}