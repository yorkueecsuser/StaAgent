class EmptyIfStatement {
  public static void main(String[] argv) {
    boolean conditionWhile = getCondition();
    if (argv.length == 1)
      ;
    while (conditionWhile) {
      // Unreachable code
    }
    System.out.println("Hello, " + argv[0]);
  }

  private static boolean getCondition() {
    return false;
  }
}