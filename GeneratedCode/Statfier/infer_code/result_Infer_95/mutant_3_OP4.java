class DivideByZero {

  public int divByZeroLocal(String s) {
    int denominator = 0;
    int nominator = 10;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Another unreachable code
      System.out.println("This will also never be printed");
    }
    int result = nominator / denominator;
    return result;
  }

  public int divideByZeroInterProc(int denominator) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This will never be printed");
    } else {
      // Another unreachable code
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
      // Another unreachable code
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
      // Another unreachable code
      System.out.println("This will also never be printed");
    }
    return divideByZeroInterProc(x);
  }

  // Method to provide dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, but it's not a compile-time constant
  }
}