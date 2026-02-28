import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    boolean condition = getCondition();
    if (condition) {
        switch (0) {
            case 1:
                System.out.println("This line should never execute.");
                break;
        }
    }
    return sdf.parse(dateStr);
  }

  private boolean getCondition() {
    return false;
  }
}