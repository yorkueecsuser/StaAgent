class Ideas_2009_01_16 {
  int x;

  public int getValueForYear(int year) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      x = x + 1;
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
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      x.x = x.x + 1;
    }

    return "x = " + x.toString();
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the while loop unreachable
  }
}