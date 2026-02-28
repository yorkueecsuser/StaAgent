class Ideas_2010_06_29 {

  static int intAverage(int a[]) {
    int count = 0;
    for (int x : a) {
      count++;
    }
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
    
    return 100 / count;
  }

  private static boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}