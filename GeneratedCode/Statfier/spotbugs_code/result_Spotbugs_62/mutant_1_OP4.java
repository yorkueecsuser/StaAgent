class IDiv {
  public static void main(String[] argv) {
    int a = Integer.parseInt(argv[0]);
    int b = Integer.parseInt(argv[1]);

    double value = (a / b);
    System.out.println(value);

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable block.");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is another unreachable block.");
    }
  }

  // Method to return a constant false value, simulating a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}