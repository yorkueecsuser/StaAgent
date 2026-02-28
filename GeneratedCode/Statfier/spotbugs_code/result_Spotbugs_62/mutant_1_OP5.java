class IDiv {
  public static void main(String[] argv) {
    int a = Integer.parseInt(argv[0]);
    int b = Integer.parseInt(argv[1]);

    double value = (a / b);
    System.out.println(value);

    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("Default case, also unreachable due to alwaysFalse");
        break;
    }
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}