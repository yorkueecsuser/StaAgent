class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      count = 0; // Unique mutant code
    } else {
      // Alternative code that will always execute
      count = count + 1; // Unique mutant code
    }
    
    return 100 / count;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}