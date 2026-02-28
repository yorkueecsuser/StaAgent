class Ideas_2009_01_16 {
  int x;

  public int getValueForYear(int year) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    
    switch (year) {
      case 2005:
        return 1;
      case 2006:
        return 1;
      case 2007:
        return 1;
      case 2008:
        return 1;
      default:
        throw new IllegalArgumentException("bad year: " + year);
    }
  }

  public static String getAge(Ideas_2009_01_16 x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }
    
    return "x = " + x.toString();
  }

  private static boolean getCondition() {
    return false; // This method returns false, making the for loop condition always false
  }
}