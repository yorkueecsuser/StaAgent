import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LI_LAZY_INIT_UPDATE_STATIC {

  static String[] weekends;

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC,MS_EXPOSE_REP")
  public static String[] getWeekends() {
    if (weekends == null) {
      weekends = new String[2];
      weekends[0] = "Sunday";
      weekends[1] = "Saturday";
      
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is never reached because getCondition() always returns false
          weekends[0] = "Not Sunday";
          break;
        case false:
          // This case is also never reached because getCondition() always returns false
          weekends[1] = "Not Saturday";
          break;
      }
    }
    return weekends;
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}