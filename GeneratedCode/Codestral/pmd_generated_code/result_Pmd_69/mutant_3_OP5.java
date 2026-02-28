import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    Date parsedDate = sdf.parse(dateStr);

    boolean condition = false;
    int value = getValue();

    // Inserted unreachable switch statement
    switch (condition? 1 : value) {
      case 1:
        throw new IllegalStateException("Unreachable code reached");
    }

    return parsedDate;
  }

  private int getValue() {
    return 0; // This method always returns 0, making the switch statement unreachable
  }
}