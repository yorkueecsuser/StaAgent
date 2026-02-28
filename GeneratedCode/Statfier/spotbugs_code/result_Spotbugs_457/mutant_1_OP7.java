class ModuloFailure {

  public static void main(String[] args) {
    int x = 17;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is always false
    }
    if ((x % 2) == 1) System.out.println("x is odd!");

    int y = x % 100 * 50;
    System.out.println(x % 12 * 5);
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is always false
  }
}