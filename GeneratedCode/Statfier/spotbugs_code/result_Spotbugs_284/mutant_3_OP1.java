import java.sql.Date;
import org.joda.time.DateTimeConstants;

class Ideas_2010_06_23 {

  public long daysAgo(int days) {
    String unusedVariable1 = "abcdefgh"; // Dead store
    return System.currentTimeMillis() - days * DateTimeConstants.MILLIS_PER_DAY;
  }

  public long daysFromNow(int days) {
    int unusedVariable2 = 12345678; // Dead store
    return System.currentTimeMillis() + days * DateTimeConstants.MILLIS_PER_DAY;
  }

  public long daysFromNow2(int days) {
    double unusedVariable3 = 98765432.1; // Dead store
    return days * DateTimeConstants.MILLIS_PER_DAY + System.currentTimeMillis();
  }

  public long daysFrom(Date d, int days) {
    boolean unusedVariable4 = true; // Dead store
    return days * DateTimeConstants.MILLIS_PER_DAY + d.getTime();
  }

  public long daysBefore(Date d, int days) {
    char unusedVariable5 = 'z'; // Dead store
    return d.getTime() - days * DateTimeConstants.MILLIS_PER_DAY;
  }

  public static void main(String args[]) {
    byte unusedVariable6 = 0x1A; // Dead store
    System.out.println(DateTimeConstants.MILLIS_PER_DAY);
    System.out.println(Integer.MAX_VALUE / DateTimeConstants.MILLIS_PER_DAY);
  }
}