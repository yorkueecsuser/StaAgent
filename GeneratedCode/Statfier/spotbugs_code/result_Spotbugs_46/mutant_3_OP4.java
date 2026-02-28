import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LI_LAZY_INIT_UPDATE_STATIC {

  static String[] weekends;

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC,MS_EXPOSE_REP")
  public static String[] getWeekends() {
    if (weekends == null) {
      weekends = new String[2];
      weekends[0] = "Sunday";
      weekends[1] = "Saturday";
    }
    
    // Inserting an unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      weekends[0] = "Monday";
      weekends[1] = "Friday";
    } else {
      // This block will always execute
      weekends[0] = "Sunday";
      weekends[1] = "Saturday";
    }
    
    return weekends;
  }

  private static boolean getCondition() {
    // Always returns false, making the if block unreachable
    return false;
  }
}