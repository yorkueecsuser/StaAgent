class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block");
    }
    int result = nominator / denominator;
    return result;
  }

  public int divideByZeroInterProc(int denominator) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in divideByZeroInterProc");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in divideByZeroInterProc");
    }
    return 10 / denominator;
  }

  // DO NOT MOVE, test relies on line number
  public int callDivideByZeroInterProc() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is an unreachable if block in callDivideByZeroInterProc");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in callDivideByZeroInterProc");
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
      System.out.println("This is an unreachable if block in divideByZeroWithStaticField");
    } else {
      // Unreachable code
      System.out.println("This is an unreachable else block in divideByZeroWithStaticField");
    }
    return divideByZeroInterProc(x);
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}