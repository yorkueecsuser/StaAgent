class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  public static void main(String[] args) {
    // Introducing an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop will never execute because conditionFor is always false
      System.out.println("This will never be printed.");
    }
  }

  private static boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}