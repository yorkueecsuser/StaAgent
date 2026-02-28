class ModuloFailure {

  public static void main(String[] args) {
    int x = 17;
    if ((x % 2) == 1) System.out.println("x is odd!");

    int y = x % 100 * 50;
    System.out.println(x % 12 * 5);

    // Introduced unreachable if statement
    boolean condition = alwaysFalse();
    if (condition) {
      System.out.println("This will never be printed!");
    }
  }

  private static boolean alwaysFalse() {
    return false;
  }
}