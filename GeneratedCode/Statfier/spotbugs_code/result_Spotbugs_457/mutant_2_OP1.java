class ModuloFailure {

  public static void main(String[] args) {
    int x = 17;
    if ((x % 2) == 1) System.out.println("x is odd!");

    // Dead store mutation
    int yvbnrhty = 42; // Unused variable declaration

    int y = x % 100 * 50;
    System.out.println(x % 12 * 5);
  }
}