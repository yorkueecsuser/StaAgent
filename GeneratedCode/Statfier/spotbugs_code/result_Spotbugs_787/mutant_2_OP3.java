class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      count = -1; // This line is unreachable due to the condition being false at runtime
    }
    return 100 / count;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}