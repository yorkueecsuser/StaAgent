class TestNonNull6b {
  public static void main(String args[]) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      System.out.println("This is an unreachable loop");
    }

    System.out.println(TestNonNull6a.f(null));
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}