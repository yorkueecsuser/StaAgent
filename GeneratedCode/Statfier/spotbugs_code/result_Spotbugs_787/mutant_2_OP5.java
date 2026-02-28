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
        // This case will never be reached because condition is always false
        count = -1;
        break;
      case 1:
        // This case will always be executed
        break;
    }
    
    return 100 / count;
  }

  // Method to simulate a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}