import java.sql.Date;
import org.joda.time.DateTimeConstants;

class Ideas_2010_06_23 {

  public long daysAgo(int days) {
    return System.currentTimeMillis() - days * DateTimeConstants.MILLIS_PER_DAY;
  }

  public long daysFromNow(int days) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
    return System.currentTimeMillis() + days * DateTimeConstants.MILLIS_PER_DAY;
  }

  public long daysFromNow2(int days) {
    return days * DateTimeConstants.MILLIS_PER_DAY + System.currentTimeMillis();
  }

  public long daysFrom(Date d, int days) {
    return days * DateTimeConstants.MILLIS_PER_DAY + d.getTime();
  }

  public long daysBefore(Date d, int days) {
    return d.getTime() - days * DateTimeConstants.MILLIS_PER_DAY;
  }

  public static void main(String args[]) {
    System.out.println(DateTimeConstants.MILLIS_PER_DAY);
    System.out.println(Integer.MAX_VALUE / DateTimeConstants.MILLIS_PER_DAY);
  }

  private boolean getCondition() {
    // This method always returns false, making the switch case unreachable
    return false;
  }
}