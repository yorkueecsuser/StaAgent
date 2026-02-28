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
        throw new IllegalArgumentException("bad year: " + year);
    }
    
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        return 2;
      case 1:
        // This case will always be reached
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }

  public static String getAge(Ideas_2009_01_16 x) {
    return "x = " + x.toString();
  }
}