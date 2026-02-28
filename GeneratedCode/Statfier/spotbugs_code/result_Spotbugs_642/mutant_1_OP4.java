class Ideas_2011_12_15 extends java.util.Date {

  // @NoWarning("VA_FORMAT_STRING_BAD_CONVERSION")
  public static void main(String args[]) {
    Ideas_2011_12_15 t = new Ideas_2011_12_15();
    System.out.printf("%tc%n", t);
    System.out.printf("%Tc%n", t);

    // Mutant code added here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}