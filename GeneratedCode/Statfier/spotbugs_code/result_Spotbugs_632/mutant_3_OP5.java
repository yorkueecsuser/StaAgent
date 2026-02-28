class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  public static void main(String[] args) {
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This will always be printed");
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement's first case unreachable
    return false;
  }
}