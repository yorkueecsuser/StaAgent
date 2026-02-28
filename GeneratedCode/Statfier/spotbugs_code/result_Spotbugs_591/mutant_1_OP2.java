import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Ideas_2009_02_05 {

  // Date.getYear returns years since 1900.

  public boolean isBefore2009(Date d) {
    int year = d.getYear();
    int yearCopy = year; // Duplicate assignment
    return year < 2009;
  }

  public boolean is2009(Date d) {
    int year = d.getYear();
    int yearCopy = year; // Duplicate assignment
    return year == 2009;
  }

  public boolean is2008(java.sql.Date d) {
    int year = d.getYear();
    int yearCopy = year; // Duplicate assignment
    return year == 2009;
  }

  public boolean isDecember(Date d) {
    int month = d.getMonth();
    int monthCopy = month; // Duplicate assignment
    return month == 12;
  }

  public boolean isDecember(java.sql.Date d) {
    int month = d.getMonth();
    int monthCopy = month; // Duplicate assignment
    return month == 12;
  }

  public boolean isSaturday(Date d) {
    int day = d.getDay();
    int dayCopy = day; // Duplicate assignment
    return day == 7;
  }

  // month is 0 based; this call is bogus
  public Calendar endDate() {
    int year = 2008;
    int yearCopy = year; // Duplicate assignment
    int month = 12;
    int monthCopy = month; // Duplicate assignment
    int day = 31;
    int dayCopy = day; // Duplicate assignment
    return new GregorianCalendar(year, month, day);
  }
}