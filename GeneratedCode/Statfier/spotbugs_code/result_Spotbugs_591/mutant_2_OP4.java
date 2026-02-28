import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Ideas_2009_02_05 {

  // Date.getYear returns years since 1900.

  public boolean isBefore2009(Date d) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (d.getYear() < 1900) {
        System.out.println("This is unreachable code.");
      } else {
        System.out.println("This is also unreachable code.");
      }
    }
    return d.getYear() < 2009;
  }

  public boolean is2009(Date d) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (d.getYear() > 2009) {
        System.out.println("This is unreachable code.");
      } else {
        System.out.println("This is also unreachable code.");
      }
    }
    return d.getYear() == 2009;
  }

  public boolean is2008(java.sql.Date d) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (d.getYear() < 2008) {
        System.out.println("This is unreachable code.");
      } else {
        System.out.println("This is also unreachable code.");
      }
    }
    return d.getYear() == 2009;
  }

  public boolean isDecember(Date d) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (d.getMonth() < 0) {
        System.out.println("This is unreachable code.");
      } else {
        System.out.println("This is also unreachable code.");
      }
    }
    return d.getMonth() == 12;
  }

  public boolean isDecember(java.sql.Date d) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (d.getMonth() < 0) {
        System.out.println("This is unreachable code.");
      } else {
        System.out.println("This is also unreachable code.");
      }
    }
    return d.getMonth() == 12;
  }

  public boolean isSaturday(Date d) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (d.getDay() < 1) {
        System.out.println("This is unreachable code.");
      } else {
        System.out.println("This is also unreachable code.");
      }
    }
    return d.getDay() == 7;
  }

  // month is 0 based; this call is bogus
  public Calendar endDate() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (new GregorianCalendar().get(Calendar.YEAR) < 2000) {
        System.out.println("This is unreachable code.");
      } else {
        System.out.println("This is also unreachable code.");
      }
    }
    return new GregorianCalendar(2008, 12, 31);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}