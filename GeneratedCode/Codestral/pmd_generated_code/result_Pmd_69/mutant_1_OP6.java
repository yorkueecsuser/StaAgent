import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  private boolean alwaysFalse() {
    return false;
  }

  public Date showBug(String dateStr) throws ParseException {
    for (int i = 0; alwaysFalse(); i++) {
      System.out.println("This line will never be executed");
    }
    return sdf.parse(dateStr);
  }
}