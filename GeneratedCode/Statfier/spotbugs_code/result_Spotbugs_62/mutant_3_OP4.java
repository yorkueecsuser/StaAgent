class IDiv {
  public static void main(String[] argv) {
    int a = Integer.parseInt(argv[0]);
    int b = Integer.parseInt(argv[1]);

    double value = (a / b);
    System.out.println(value);

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run because shouldRun is always false.");
    } else {
      System.out.println("This will also never run because shouldRun is always false.");
    }
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}