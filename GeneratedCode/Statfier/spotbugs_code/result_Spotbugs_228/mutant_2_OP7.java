class EqualButNotEqual {

  public static void main(String args[]) {
    Double d = Double.valueOf(Double.NaN);
    Double d2 = Double.valueOf(Double.NaN);

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This is an unreachable loop");
    }

    System.out.println(d == Float.NaN);
    System.out.println(d.equals(Float.NaN));
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}