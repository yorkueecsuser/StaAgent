import java.text.SimpleDateFormat;

public enum Bug2012727 {
  mmddyyyy_WithTimeSlashDelimited("MM/dd/yyyy HH:mm:ss"),
  ddyymmM_dateOnlyNOTDelimited("ddyyMMM");

  private SimpleDateFormat simpleDateFormat;

  private Bug2012727(String format) {
    simpleDateFormat = new SimpleDateFormat(format);
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      simpleDateFormat.applyPattern("yyyy-MM-dd");
    }
  }

  public SimpleDateFormat getFormat() {
    return simpleDateFormat;
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}