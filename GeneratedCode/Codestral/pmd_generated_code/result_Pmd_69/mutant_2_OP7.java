import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter {
  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  private boolean getUnreachableCondition() {
    return false;
  }

  public Date showBug(String dateStr) throws ParseException {
    // Introduce mutant: Unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // This block will never be executed
      System.out.println("This is an unreachable code block.");
    }

    return sdf.parse(dateStr);
  }
}