class Ideas_2009_01_16 {
  int x;

  public int getValueForYear(int year) {
    // Inserting an unreachable for loop
    boolean conditionFor = getConditionFor();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
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
    // Inserting an unreachable for loop
    boolean conditionFor = getConditionForStatic();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    return "x = " + x.toString();
  }

  private boolean getConditionFor() {
    return false;
  }

  private static boolean getConditionForStatic() {
    return false;
  }
}