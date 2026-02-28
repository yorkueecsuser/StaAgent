import java.sql.Date;
import org.joda.time.DateTimeConstants;

class Ideas_2010_06_23 {

  public long daysAgo(int days) {
    long result = System.currentTimeMillis() - days * DateTimeConstants.MILLIS_PER_DAY;
    long resultCopy = System.currentTimeMillis() - days * DateTimeConstants.MILLIS_PER_DAY; // Mutant
    return result;
  }

  public long daysFromNow(int days) {
    long result = System.currentTimeMillis() + days * DateTimeConstants.MILLIS_PER_DAY;
    long resultCopy = System.currentTimeMillis() + days * DateTimeConstants.MILLIS_PER_DAY; // Mutant
    return result;
  }

  public long daysFromNow2(int days) {
    long result = days * DateTimeConstants.MILLIS_PER_DAY + System.currentTimeMillis();
    long resultCopy = days * DateTimeConstants.MILLIS_PER_DAY + System.currentTimeMillis(); // Mutant
    return result;
  }

  public long daysFrom(Date d, int days) {
    long result = days * DateTimeConstants.MILLIS_PER_DAY + d.getTime();
    long resultCopy = days * DateTimeConstants.MILLIS_PER_DAY + d.getTime(); // Mutant
    return result;
  }

  public long daysBefore(Date d, int days) {
    long result = d.getTime() - days * DateTimeConstants.MILLIS_PER_DAY;
    long resultCopy = d.getTime() - days * DateTimeConstants.MILLIS_PER_DAY; // Mutant
    return result;
  }

  public static void main(String args[]) {
    System.out.println(DateTimeConstants.MILLIS_PER_DAY);
    System.out.println(Integer.MAX_VALUE / DateTimeConstants.MILLIS_PER_DAY);
  }
}