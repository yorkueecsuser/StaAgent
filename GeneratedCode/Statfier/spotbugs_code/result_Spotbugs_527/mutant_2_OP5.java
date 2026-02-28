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
    switch (getValue(condition)) {
      case 1:
        // This case is unreachable because getValue(condition) will never return 1
        System.out.println("This is an unreachable case.");
        break;
    }
    return FORMAT_DB_DATE.format("");
  }

  @ExpectWarning("STCAL_INVOKE_ON_STATIC_DATE_FORMAT_INSTANCE")
  public String two() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // This case is unreachable because getValue(condition) will never return 1
        System.out.println("This is an unreachable case.");
        break;
    }
    return FORMAT_DB_DATE2.format("");
  }

  @ExpectWarning("STCAL_INVOKE_ON_STATIC_DATE_FORMAT_INSTANCE")
  public String three() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // This case is unreachable because getValue(condition) will never return 1
        System.out.println("This is an unreachable case.");
        break;
    }
    return formatDBDate3.format("");
  }

  private boolean getCondition() {
    // Always returns false, making the switch case unreachable
    return false;
  }

  private int getValue(boolean condition) {
    // Returns 0 if condition is false, ensuring the switch case is unreachable
    return condition? 0 : 0;
  }
}