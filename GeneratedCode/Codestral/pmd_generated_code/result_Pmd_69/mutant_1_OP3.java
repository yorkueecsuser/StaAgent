import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class DateFormatter {
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public Date showBug(String dateStr) throws ParseException {
    if (getUnreachableCondition()) {
      throw new IllegalStateException("Unreachable code executed");
    }
    return sdf.parse(dateStr);
  }

  private boolean getUnreachableCondition() {
    return new Random().nextBoolean() &&!new Random().nextBoolean();
  }
}