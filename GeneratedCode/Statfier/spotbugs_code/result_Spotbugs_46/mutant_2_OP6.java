import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LI_LAZY_INIT_UPDATE_STATIC {

  static String[] weekends;

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC,MS_EXPOSE_REP")
  public static String[] getWeekends() {
    if (weekends == null) {
      weekends = new String[2];
      weekends[0] = "Sunday";
      weekends[1] = "Saturday";
      
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() will return false
      }
    }
    return weekends;
  }

  private static boolean getCondition() {
    return false;
  }
}