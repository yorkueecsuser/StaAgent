class ModuloFailure {

  public static void main(String[] args) {
    int x = 17;
    if ((x % 2) == 1) System.out.println("x is odd!");

    int y = x % 100 * 50;
    System.out.println(x % 12 * 5);

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        // Do nothing, this is the unreachable part
        break;
    }
  }

  private static boolean getAlwaysFalse() {
    return false;
  }
}