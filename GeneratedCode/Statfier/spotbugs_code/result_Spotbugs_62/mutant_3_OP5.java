class IDiv {
  public static void main(String[] argv) {
    int a = Integer.parseInt(argv[0]);
    int b = Integer.parseInt(argv[1]);

    double value = (a / b);
    System.out.println(value);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also not be executed due to the same reason
        System.out.println("This is also an unreachable case.");
        break;
    }
  }

  // Method to return a constant false condition
  private static boolean getCondition() {
    return false;
  }
}