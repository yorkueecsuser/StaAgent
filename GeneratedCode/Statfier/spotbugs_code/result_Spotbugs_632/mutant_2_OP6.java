class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  public static void main(String[] args) {
    // Introducing an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This loop is unreachable");
    }
  }

  private static boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}