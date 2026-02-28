class ModuloFailure {

  public static void main(String[] args) {
    int x = 17;
    if ((x % 2) == 1) System.out.println("x is odd!");

    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }

    int y = x % 100 * 50;
    System.out.println(x % 12 * 5);
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // Always returns true to ensure the if block is reachable
  }
}