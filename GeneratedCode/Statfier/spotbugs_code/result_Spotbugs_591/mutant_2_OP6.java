import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Ideas_2009_02_05 {

  // Date.getYear returns years since 1900.

  public boolean isBefore2009(Date d) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return d.getYear() < 2009;
  }

  public boolean is2009(Date d) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return d.getYear() == 2009;
  }

  public boolean is2008(java.sql.Date d) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return d.getYear() == 2009;
  }

  public boolean isDecember(Date d) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return d.getMonth() == 12;
  }

  public boolean isDecember(java.sql.Date d) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return d.getMonth() == 12;
  }

  public boolean isSaturday(Date d) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return d.getDay() == 7;
  }

  // month is 0 based; this call is bogus
  public Calendar endDate() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return new GregorianCalendar(2008, 12, 31);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime but always returns false
  }
}