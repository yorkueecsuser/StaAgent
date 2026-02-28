class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    
    // Mutant code start
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      count = 0; // This line does not affect the original logic
    } else {
      // Alternative code
      count = count + 1; // This line also does not affect the original logic
    }
    // Mutant code end

    return 100 / count;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the if block is unreachable at runtime
  }
}