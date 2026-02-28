class EqualButNotEqual {

  public static void main(String args[]) {
    Double d = Double.valueOf(Double.NaN);
    Double d2 = Double.valueOf(Double.NaN);

    System.out.println(d == Float.NaN);
    System.out.println(d.equals(Float.NaN));

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This will never be printed");
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}