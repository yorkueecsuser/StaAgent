import java.text.SimpleDateFormat;

public enum Bug2012727 {
  mmddyyyy_WithTimeSlashDelimited("MM/dd/yyyy HH:mm:ss"),
  ddyymmM_dateOnlyNOTDelimited("ddyyMMM");

  private SimpleDateFormat simpleDateFormat;

  private Bug2012727(String format) {
    simpleDateFormat = new SimpleDateFormat(format);

    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("This will also never be printed");
        break;
    }
  }

  public SimpleDateFormat getFormat() {
    return simpleDateFormat;
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}