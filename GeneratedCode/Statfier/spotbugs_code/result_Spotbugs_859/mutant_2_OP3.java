import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.text.SimpleDateFormat;

class Bug3441912a {
  @ExpectWarning("STCAL_STATIC_SIMPLE_DATE_FORMAT_INSTANCE")
  public static final SimpleDateFormat FORMAT_DB_DATE = new SimpleDateFormat("yyyyMMdd");

  @ExpectWarning("STCAL_INVOKE_ON_STATIC_DATE_FORMAT_INSTANCE")
  public String one() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    return FORMAT_DB_DATE.format("");
  }

  private boolean getCondition() {
    return false;
  }
}