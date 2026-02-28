class EqualButNotEqual {

  public static void main(String args[]) {
    Double d = Double.valueOf(Double.NaN);
    Double d2 = Double.valueOf(Double.NaN);

    System.out.println(d == Float.NaN);
    System.out.println(d.equals(Float.NaN));

    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed because the condition is always false.");
    } else {
      System.out.println("This will also never be printed because the condition is always false.");
    }
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}