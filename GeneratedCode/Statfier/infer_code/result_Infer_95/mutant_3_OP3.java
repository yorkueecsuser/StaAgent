class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    int result = nominator / denominator;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return result;
  }

  public int divideByZeroInterProc(int denominator) {
    return 10 / denominator;
  }

  // DO NOT MOVE, test relies on line number
  public int callDivideByZeroInterProc() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement");
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
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return divideByZeroInterProc(x);
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, but it is not a compile-time constant
  }
}