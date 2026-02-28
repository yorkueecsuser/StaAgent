class EqualButNotEqual {

  public static void main(String args[]) {
    Double d = Double.valueOf(Double.NaN);
    Double d2 = Double.valueOf(Double.NaN);

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
      System.out.println("This will never be printed");
    }

    System.out.println(d == Float.NaN);
    System.out.println(d.equals(Float.NaN));
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}