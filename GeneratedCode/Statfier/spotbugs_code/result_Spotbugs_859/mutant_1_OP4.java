import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.text.SimpleDateFormat;

class Bug3441912a {
  @ExpectWarning("STCAL_STATIC_SIMPLE_DATE_FORMAT_INSTANCE")
  public static final SimpleDateFormat FORMAT_DB_DATE = new SimpleDateFormat("yyyyMMdd");

  @ExpectWarning("STCAL_INVOKE_ON_STATIC_DATE_FORMAT_INSTANCE")
  public String one() {
    // Introduced an unreachable if-else statement with a dynamically determined condition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always execute
      System.out.println("This block will execute");
    }

    return FORMAT_DB_DATE.format("");
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}