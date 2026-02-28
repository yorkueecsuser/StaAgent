import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    Date parsedDate = sdf.parse(dateStr);
    // Mutant code: Duplication of the assignment statement
    Date duplicatedDate = parsedDate;
    return parsedDate;
  }
}