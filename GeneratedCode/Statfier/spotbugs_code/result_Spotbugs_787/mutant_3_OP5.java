class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    
    // Introduced an unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case is unreachable because alwaysFalse is never set to true
        count = -1; // Some arbitrary operation to make the case unique
        break;
    }
    
    return 100 / count;
  }

  // Method to simulate a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}