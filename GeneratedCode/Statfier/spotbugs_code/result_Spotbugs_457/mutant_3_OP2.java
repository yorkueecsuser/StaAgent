class ModuloFailure {

  public static void main(String[] args) {
    int x = 17;
    x = 17; // Duplicate of the assignment statement for x
    if ((x % 2) == 1) System.out.println("x is odd!");

    int y = x % 100 * 50;
    y = x % 100 * 50; // Duplicate of the assignment statement for y
    System.out.println(x % 12 * 5);
  }
}