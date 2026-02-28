class Ideas_2009_01_02 {

  /**
   * The Zune 30 loop of death From http://pastie.org/349916
   *
   * <p>This code goes into an infinite loop on Dec 31st of a leap year
   *
   * @param days since Jan 0, 1980
   * @return the year
   */
  static int zuneLoopOfDeath(int days) {
    int year = 1980;

    // Introducing an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be executed
        year = 2000;
        break;
      default:
        // Default case will also never be executed
        year = 2001;
        break;
    }

    while (days > 365) {
      if (year % 4 == 0 && (year % 100!= 0 || year % 400 == 0)) {
        /** Leap year */
        if (days > 366) {
          days -= 366;
          year += 1;
        }
      } else {
        /** Non-leap year */
        days -= 365;
        year += 1;
      }
    }
    return year;
  }

  // Method to return a compile-time constant false in a non-direct way
  private static boolean getAlwaysFalse() {
    return 1!= 1;
  }

  public static void main(String args[]) {
    for (int d = 0; d < 500; d++) System.out.printf("%5d %5d\n", d, zuneLoopOfDeath(d));
  }
}