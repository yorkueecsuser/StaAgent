class Ideas_2011_12_15 extends java.util.Date {

  // @NoWarning("VA_FORMAT_STRING_BAD_CONVERSION")
  public static void main(String args[]) {
    Ideas_2011_12_15 t = new Ideas_2011_12_15();
    System.out.printf("%tc%n", t);
    System.out.printf("%Tc%n", t);

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}