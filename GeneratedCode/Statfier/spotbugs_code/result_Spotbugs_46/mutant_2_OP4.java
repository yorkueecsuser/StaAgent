import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LI_LAZY_INIT_UPDATE_STATIC {

  static String[] weekends;

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC,MS_EXPOSE_REP")
  public static String[] getWeekends() {
    if (weekends == null) {
      weekends = new String[2];
      weekends[0] = "Sunday";
      weekends[1] = "Saturday";
      
      // Mutant: Unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() returns false
        weekends[0] = "Not Sunday";
        weekends[1] = "Not Saturday";
      } else {
        // This block will always execute
        weekends[0] = "Sunday";
        weekends[1] = "Saturday";
      }
    }
    return weekends;
  }

  private static boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}