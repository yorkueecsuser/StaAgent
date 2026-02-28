class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will never return true
    }
    
    return 100 / count;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}