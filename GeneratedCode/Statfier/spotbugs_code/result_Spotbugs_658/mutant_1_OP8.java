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
    int x = days; // Mutant variable

    while (x > 365) {
      if (year % 4 == 0 && (year % 100!= 0 || year % 400 == 0)) {
        /** Leap year */
        if (x > 366) {
          x -= 366;
          year += 1;
        }
      } else {
        /** Non-leap year */
        x -= 365;
        year += 1;
      }
    }
    return year;
  }

  public static void main(String args[]) {
    for (int d = 0; d < 500; d++) System.out.printf("%5d %5d\n", d, zuneLoopOfDeath(d));
  }
}