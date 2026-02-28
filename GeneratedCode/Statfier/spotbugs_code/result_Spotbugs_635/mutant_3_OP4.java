class Ideas_2009_01_16 {
  int x;

  public int getValueForYear(int year) {
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
        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block is unreachable because getCondition() always returns false
          return 2;
        } else {
          // This block is also unreachable but ensures no unreachable statement error
          return 3;
        }
        throw new IllegalArgumentException("bad year: " + year);
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }

  public static String getAge(Ideas_2009_01_16 x) {
    return "x = " + x.toString();
  }
}