class ModuloFailure {

  public static void main(String[] args) {
    int x = 17;
    if ((x % 2) == 1) System.out.println("x is odd!");

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed because condition is always false.");
    } else {
      System.out.println("This will also never be printed because condition is always false.");
    }

    int y = x % 100 * 50;
    System.out.println(x % 12 * 5);
  }

  // Method to return a constant false condition
  private static boolean getCondition() {
    return false;
  }
}