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

    // Introduced unreachable if statement according to mutation operator
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      weekends[0] = "Not Sunday";
      weekends[1] = "Not Saturday";
    }

    return weekends;
  }

  private static boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}