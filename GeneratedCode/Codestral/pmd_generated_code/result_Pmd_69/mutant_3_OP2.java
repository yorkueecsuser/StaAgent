import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  // Original code
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  // Mutant code
  private SimpleDateFormat sdfDuplicate = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    return sdf.parse(dateStr);
  }
}