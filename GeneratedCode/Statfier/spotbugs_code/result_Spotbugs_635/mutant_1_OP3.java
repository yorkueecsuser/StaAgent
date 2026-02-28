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
          return 0; // This line is unreachable
        }
        throw new IllegalArgumentException("bad year: " + year);
    }
  }

  public static String getAge(Ideas_2009_01_16 x) {
    return "x = " + x.toString();
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}