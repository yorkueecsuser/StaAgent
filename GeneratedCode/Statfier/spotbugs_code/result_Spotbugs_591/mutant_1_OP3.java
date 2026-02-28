import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Ideas_2009_02_05 {

  // Date.getYear returns years since 1900.

  public boolean isBefore2009(Date d) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return d.getYear() < 2009;
  }

  public boolean is2009(Date d) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return d.getYear() == 2009;
  }

  public boolean is2008(java.sql.Date d) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return d.getYear() == 2009;
  }

  public boolean isDecember(Date d) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return d.getMonth() == 12;
  }

  public boolean isDecember(java.sql.Date d) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return d.getMonth() == 12;
  }

  public boolean isSaturday(Date d) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return d.getDay() == 7;
  }

  // month is 0 based; this call is bogus
  public Calendar endDate() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return new GregorianCalendar(2008, 12, 31);
  }

  private boolean getCondition() {
    return false;
  }
}