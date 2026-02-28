class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    
    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      count = -1; // This line is unreachable
    }
    
    return 100 / count;
  }

  // Method to provide a dynamically determined condition that is always false
  private static boolean getUnreachableCondition() {
    return false;
  }
}