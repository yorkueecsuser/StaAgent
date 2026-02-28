class Bug1931535 {
  public static void main(String[] args) {
    Boolean active = new Boolean("true");
    Boolean active1 = Boolean.getBoolean("active")? new Boolean(null) : null;

    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
      System.out.println("This loop is unreachable");
    }

    System.out.println("active:" + active);
    System.out.println("active1:" + active1);
  }

  // Method to return a false condition for the while loop
  private static boolean getCondition() {
    return false;
  }
}