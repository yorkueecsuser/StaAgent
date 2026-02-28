import java.text.SimpleDateFormat;

public enum Bug2012727 {
  mmddyyyy_WithTimeSlashDelimited("MM/dd/yyyy HH:mm:ss"),
  ddyymmM_dateOnlyNOTDelimited("ddyyMMM");

  private SimpleDateFormat simpleDateFormat;

  private Bug2012727(String format) {
    simpleDateFormat = new SimpleDateFormat(format);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a reachable block
      System.out.println("This block is reachable.");
    } else {
      // This is an unreachable block due to the condition always being false
      System.out.println("This block is unreachable.");
    }
  }

  public SimpleDateFormat getFormat() {
    return simpleDateFormat;
  }

  private boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}