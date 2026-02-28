class ModuloFailure {

  public static void main(String[] args) {
    int x = 17;
    if ((x % 2) == 1) System.out.println("x is odd!");
    int x = 17; // Duplicate of the assignment to x

    int y = x % 100 * 50;
    int y = x % 100 * 50; // Duplicate of the assignment to y

    System.out.println(x % 12 * 5);
  }
}