class TestNonNull6b {
  public static void main(String args[]) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
      System.out.println("This will never be printed");
    }

    System.out.println(TestNonNull6a.f(null));
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}