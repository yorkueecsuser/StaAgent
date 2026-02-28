import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  // Mutant code added: Duplication of the assignment statement
  private SimpleDateFormat sdfDuplicate = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    return sdf.parse(dateStr);
  }
}