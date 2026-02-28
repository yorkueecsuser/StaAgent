class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  public static void main(String[] args) {
    // Introducing an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable loop");
    }
  }

  private static boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}