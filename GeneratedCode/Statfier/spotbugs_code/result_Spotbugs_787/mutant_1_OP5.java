class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        count = -1;
        break;
      case 1:
        // This case is always executed
        break;
    }
    
    return 100 / count;
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}