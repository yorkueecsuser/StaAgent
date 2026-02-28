import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Bug3441912 {
  @ExpectWarning("STCAL_STATIC_SIMPLE_DATE_FORMAT_INSTANCE")
  public static final SimpleDateFormat FORMAT_DB_DATE = new SimpleDateFormat("yyyyMMdd");

  @ExpectWarning("STCAL_STATIC_SIMPLE_DATE_FORMAT_INSTANCE")
  public static final DateFormat FORMAT_DB_DATE2 = new SimpleDateFormat("yyyyMMdd");

  @ExpectWarning("STCAL_STATIC_SIMPLE_DATE_FORMAT_INSTANCE")
  public static DateFormat formatDBDate3;

  public static void setFormat(DateFormat f) {
    formatDBDate3 = f;
  }

  @ExpectWarning("STCAL_INVOKE_ON_STATIC_DATE_FORMAT_INSTANCE")
  public String one() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return FORMAT_DB_DATE.format("");
  }

  @ExpectWarning("STCAL_INVOKE_ON_STATIC_DATE_FORMAT_INSTANCE")
  public String two() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is another unreachable switch case.");
        break;
    }
    return FORMAT_DB_DATE2.format("");
  }

  @ExpectWarning("STCAL_INVOKE_ON_STATIC_DATE_FORMAT_INSTANCE")
  public String three() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Yet another unreachable switch case.");
        break;
    }
    return formatDBDate3.format("");
  }

  private boolean getCondition() {
    return false;
  }
}