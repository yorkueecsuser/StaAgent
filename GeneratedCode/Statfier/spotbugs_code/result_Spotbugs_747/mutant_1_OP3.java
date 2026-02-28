class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;

    // Mutated code: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    }

    System.out.println("Hello, " + argv[0]);
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}