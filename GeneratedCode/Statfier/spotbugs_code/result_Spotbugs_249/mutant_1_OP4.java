class TestNonNull6b {
  public static void main(String args[]) {
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      // This is the unreachable branch
      System.out.println("This is unreachable code.");
    }

    System.out.println(TestNonNull6a.f(null));
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}