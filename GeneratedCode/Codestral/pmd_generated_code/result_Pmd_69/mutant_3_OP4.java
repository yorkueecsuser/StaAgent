import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    boolean unreachableCondition = isUnreachableCondition();
    if (unreachableCondition) {
      // This is the unreachable branch
      System.out.println("This is an unreachable branch!");
    } else {
      // This is the original branch
      return sdf.parse(dateStr);
    }
  }

  // This is a method that returns false to make the branch unreachable
  private boolean isUnreachableCondition() {
    return false;
  }
}