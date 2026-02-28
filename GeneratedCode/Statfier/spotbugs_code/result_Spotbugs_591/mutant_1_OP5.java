import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Ideas_2009_02_05 {

  // Date.getYear returns years since 1900.

  public boolean isBefore2009(Date d) {
    return d.getYear() < 2009;
    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  public boolean is2009(Date d) {
    return d.getYear() == 2009;
    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  public boolean is2008(java.sql.Date d) {
    return d.getYear() == 2009;
    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  public boolean isDecember(Date d) {
    return d.getMonth() == 12;
    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  public boolean isDecember(java.sql.Date d) {
    return d.getMonth() == 12;
    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  public boolean isSaturday(Date d) {
    return d.getDay() == 7;
    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  // month is 0 based; this call is bogus
  public Calendar endDate() {
    return new GregorianCalendar(2008, 12, 31);
    // Introduced unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  private int getUnreachableCondition() {
    return 0; // This ensures the switch statement is always unreachable
  }
}