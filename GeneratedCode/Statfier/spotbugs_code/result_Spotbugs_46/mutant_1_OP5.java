import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LI_LAZY_INIT_UPDATE_STATIC {

  static String[] weekends;

  @ExpectWarning("LI_LAZY_INIT_UPDATE_STATIC,MS_EXPOSE_REP")
  public static String[] getWeekends() {
    if (weekends == null) {
      weekends = new String[2];
      weekends[0] = "Sunday";
      weekends[1] = "Saturday";
      
      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This is an unreachable case.");
          break;
        default:
          // This is the only reachable case
          System.out.println("This is the reachable default case.");
          break;
      }
    }
    return weekends;
  }

  private static boolean getCondition() {
    // This method returns false, making the switch condition always false
    return false;
  }
}