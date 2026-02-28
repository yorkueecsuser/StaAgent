class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;

    // Introduced an unreachable for loop as per the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    System.out.println("Hello, " + argv[0]);
  }

  // Method to return a condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}