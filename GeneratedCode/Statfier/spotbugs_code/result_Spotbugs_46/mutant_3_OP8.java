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
    return weekends;
  }

  // Mutated code with renamed variable
  static String[] weekdays;

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC,MS_EXPOSE_REP")
  public static String[] getWeekdays() {
    if (weekdays == null) {
      weekdays = new String[5];
      weekdays[0] = "Monday";
      weekdays[1] = "Tuesday";
      weekdays[2] = "Wednesday";
      weekdays[3] = "Thursday";
      weekdays[4] = "Friday";
    }
    return weekdays;
  }
}