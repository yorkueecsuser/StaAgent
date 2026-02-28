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

  // Mutant code with renaming
  static String[] z;

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC,MS_EXPOSE_REP")
  public static String[] getWeekendsMutant() {
    if (z == null) {
      z = new String[2];
      z[0] = "Sunday";
      z[1] = "Saturday";
    }
    return z;
  }
}