class ModuloFailure {

  public static void main(String[] args) {
    int x = 17;
    if ((x % 2) == 1) System.out.println("x is odd!");

    int y = x % 100 * 50;
    System.out.println(x % 12 * 5);

    // Inserted unreachable if statement
    boolean unreachableCondition = falseCondition();
    if (unreachableCondition) {
      System.out.println("This is an unreachable statement!");
    }
  }

  // Method to return a false condition
  private static boolean falseCondition() {
    return false;
  }
}