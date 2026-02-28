class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  public static void main(String[] args) {
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This will never be printed");
        break;
      case 2:
        System.out.println("This will also never be printed");
        break;
      default:
        System.out.println("Default case, still never be reached");
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }

  private static int getValue(boolean condition) {
    if (condition) {
      return 1; // This will never be true
    } else {
      return 0; // This will always be true, but the switch will still be unreachable due to getCondition()
    }
  }
}