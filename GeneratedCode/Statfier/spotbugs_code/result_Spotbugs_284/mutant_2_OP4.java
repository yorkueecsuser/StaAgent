import java.sql.Date;
import org.joda.time.DateTimeConstants;

class Ideas_2010_06_23 {

  public long daysAgo(int days) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in daysAgo");
    }
    return System.currentTimeMillis() - days * DateTimeConstants.MILLIS_PER_DAY;
  }

  public long daysFromNow(int days) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in daysFromNow");
    }
    return System.currentTimeMillis() + days * DateTimeConstants.MILLIS_PER_DAY;
  }

  public long daysFromNow2(int days) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in daysFromNow2");
    }
    return days * DateTimeConstants.MILLIS_PER_DAY + System.currentTimeMillis();
  }

  public long daysFrom(Date d, int days) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in daysFrom");
    }
    return days * DateTimeConstants.MILLIS_PER_DAY + d.getTime();
  }

  public long daysBefore(Date d, int days) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in daysBefore");
    }
    return d.getTime() - days * DateTimeConstants.MILLIS_PER_DAY;
  }

  public static void main(String args[]) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in main");
    }
    System.out.println(DateTimeConstants.MILLIS_PER_DAY);
    System.out.println(Integer.MAX_VALUE / DateTimeConstants.MILLIS_PER_DAY);
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the if-blocks unreachable
  }
}