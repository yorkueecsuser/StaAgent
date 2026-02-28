class TestNonNull6b {
  public static void main(String args[]) {
    // Original code
    System.out.println(TestNonNull6a.f(null));

    // Mutated code: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // This ensures the if block is reachable and the else block is unreachable
  }
}