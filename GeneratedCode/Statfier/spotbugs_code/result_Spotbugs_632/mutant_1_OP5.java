class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  public static void main(String[] args) {
    // Adding an unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case will never be reached because alwaysFalse is false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to avoid unreachable statement error
        System.out.println("Default case.");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}