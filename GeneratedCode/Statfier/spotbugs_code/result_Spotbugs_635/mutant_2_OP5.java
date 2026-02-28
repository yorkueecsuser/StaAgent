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
  }

  public static String getAge(Ideas_2009_01_16 x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable switch statement
      int unreachableValue = getUnreachableValue();
      switch (unreachableValue) {
        case 2009:
          System.out.println("This is unreachable");
          break;
        case 2010:
          System.out.println("This is also unreachable");
          break;
        default:
          System.out.println("Default case is unreachable");
      }
    }
    return "x = " + x.toString();
  }

  private static boolean getCondition() {
    // This method should return false at runtime to ensure the switch is unreachable
    return false;
  }

  private static int getUnreachableValue() {
    // This method provides a value for the switch statement
    return 2009;
  }
}