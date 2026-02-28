class IDiv {
  public static void main(String[] argv) {
    int a = Integer.parseInt(argv[0]);
    int b = Integer.parseInt(argv[1]);

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      System.out.println("This loop is unreachable");
    }

    double value = (a / b);
    System.out.println(value);
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}