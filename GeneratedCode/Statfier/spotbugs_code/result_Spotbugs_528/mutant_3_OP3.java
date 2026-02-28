import java.text.SimpleDateFormat;

public enum Bug2012727 {
  mmddyyyy_WithTimeSlashDelimited("MM/dd/yyyy HH:mm:ss"),
  ddyymmM_dateOnlyNOTDelimited("ddyyMMM");

  private SimpleDateFormat simpleDateFormat;

  private Bug2012727(String format) {
    simpleDateFormat = new SimpleDateFormat(format);
    // Introduced an unreachable if statement with a dynamic condition
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      simpleDateFormat.setLenient(false);
    }
  }

  public SimpleDateFormat getFormat() {
    return simpleDateFormat;
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}