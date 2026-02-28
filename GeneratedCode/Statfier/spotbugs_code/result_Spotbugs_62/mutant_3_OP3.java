class IDiv {
  public static void main(String[] argv) {
    int a = Integer.parseInt(argv[0]);
    int b = Integer.parseInt(argv[1]);

    double value = (a / b);
    System.out.println(value);

    // Mutant code: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}