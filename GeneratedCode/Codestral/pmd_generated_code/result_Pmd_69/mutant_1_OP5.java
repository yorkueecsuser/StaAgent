import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // BUG: SimpleDateFormatNeedsLocale - Not specifying Locale can lead to incorrect date formatting
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    int unreachableValue = getUnreachableValue(); // A method that always returns a value other than 1
    switch(unreachableValue) { // The switch condition is dynamically determined at runtime
      case 1:
        // Unreachable code
        System.out.println("This code will never execute!");
        break;
    }
    return sdf.parse(dateStr);
  }

  private int getUnreachableValue() {
    return 0; // Always return a value other than 1
  }
}