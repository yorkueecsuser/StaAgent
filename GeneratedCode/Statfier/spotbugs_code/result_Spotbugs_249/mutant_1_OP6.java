class TestNonNull6b {
  public static void main(String args[]) {
    // Original code
    System.out.println(TestNonNull6a.f(null));

    // Inserted unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  // Method to provide a dynamic condition that evaluates to false
  private static boolean getCondition() {
    return false;
  }
}