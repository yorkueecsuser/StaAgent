class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    int result = nominator / denominator;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
    return result;
  }

  public int divideByZeroInterProc(int denominator) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
    return 10 / denominator;
  }

  // DO NOT MOVE, test relies on line number
  public int callDivideByZeroInterProc() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Alternative unreachable code
      System.out.println("This will also never be printed");
    }
    return divideByZeroInterProc(x);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}