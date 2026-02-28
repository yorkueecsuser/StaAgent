class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is an unreachable else block.");
    }

    System.out.println("Hello, " + argv[0]);
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}