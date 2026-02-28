import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    // Mutation Operator: Unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
        // Unreachable code begins here
        throw new AssertionError("This statement should be unreachable!");
        // Unreachable code ends here
    }
    return sdf.parse(dateStr);
  }

  // Dummy method to simulate a dynamically determined condition
  private boolean getUnreachableCondition() {
      return false;
  }
}