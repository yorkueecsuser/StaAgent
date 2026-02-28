class ModuloFailure {

  public static void main(String[] args) {
    int x = 17;
    if ((x % 2) == 1) System.out.println("x is odd!");

    int y = x % 100 * 50;
    System.out.println(x % 12 * 5);

    // Mutant code
    int a = 17;
    if ((a % 2) == 1) System.out.println("a is odd!");

    int b = a % 100 * 50;
    System.out.println(a % 12 * 5);
  }
}