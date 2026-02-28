import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.text.SimpleDateFormat;

class Bug3441912a {
  @ExpectWarning("STCAL_STATIC_SIMPLE_DATE_FORMAT_INSTANCE")
  public static final SimpleDateFormat FORMAT_DB_DATE = new SimpleDateFormat("yyyyMMdd");

  @ExpectWarning("STCAL_INVOKE_ON_STATIC_DATE_FORMAT_INSTANCE")
  public String one() {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }

    return FORMAT_DB_DATE.format("");
  }

  private boolean getCondition() {
    return false;
  }
}