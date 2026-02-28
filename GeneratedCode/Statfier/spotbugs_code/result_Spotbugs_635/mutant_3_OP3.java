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
        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          return 2; // This line is unreachable because getCondition() always returns false
        }
        throw new IllegalArgumentException("bad year: " + year);
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }

  public static String getAge(Ideas_2009_01_16 x) {
    return "x = " + x.toString();
  }
}