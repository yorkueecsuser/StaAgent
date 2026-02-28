class EmptyIfStatement {
  public static void main(String[] argv) {
    if (argv.length == 1)
      ;
    
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }

    System.out.println("Hello, " + argv[0]);
  }

  private static boolean getCondition() {
    return false;
  }
}