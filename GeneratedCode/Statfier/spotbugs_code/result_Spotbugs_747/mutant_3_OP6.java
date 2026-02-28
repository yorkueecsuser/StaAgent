class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;
    
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    System.out.println("Hello, " + argv[0]);
  }

  // Method to return a false condition
  private static boolean getCondition() {
    return false;
  }
}