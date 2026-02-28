class EmptyIfStatement {
  public static void main(String[] argv) {
    boolean conditionWhile = getCondition();
    if (argv.length == 1)
      ;
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is dynamically determined and set to false
    }
    System.out.println("Hello, " + argv[0]);
  }

  private static boolean getCondition() {
    return false;
  }
}