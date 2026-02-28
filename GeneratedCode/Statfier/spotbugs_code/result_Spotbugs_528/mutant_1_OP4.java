import java.text.SimpleDateFormat;

public enum Bug2012727 {
  mmddyyyy_WithTimeSlashDelimited("MM/dd/yyyy HH:mm:ss"),
  ddyymmM_dateOnlyNOTDelimited("ddyyMMM");

  private SimpleDateFormat simpleDateFormat;

  private Bug2012727(String format) {
    simpleDateFormat = new SimpleDateFormat(format);
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      simpleDateFormat.applyPattern("yyyy-MM-dd");
    } else {
      // This block will always execute
      simpleDateFormat.applyPattern(format);
    }
  }

  public SimpleDateFormat getFormat() {
    return simpleDateFormat;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-block unreachable
    return false;
  }
}