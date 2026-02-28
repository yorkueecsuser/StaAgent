class Ideas_2011_12_15 extends java.util.Date {

  // @NoWarning("VA_FORMAT_STRING_BAD_CONVERSION")
  public static void main(String args[]) {
    Ideas_2011_12_15 t = new Ideas_2011_12_15();
    System.out.printf("%tc%n", t);
    System.out.printf("%Tc%n", t);

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic but always false condition
  private static boolean getCondition() {
    return false;
  }
}