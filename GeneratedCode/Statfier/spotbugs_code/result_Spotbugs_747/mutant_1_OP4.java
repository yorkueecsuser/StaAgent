class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }

    System.out.println("Hello, " + argv[0]);
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}