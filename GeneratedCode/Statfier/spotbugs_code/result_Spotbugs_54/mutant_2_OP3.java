import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

class Ideas_2009_10_10 {

  void test(SimpleDateFormat sdf, String date) throws Exception {
    DateFormat df = sdf;
    if (date == null) System.out.println("oops");
    
    // Inserting an unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }

    date = null;
    Date d1 = df.parse(date);
    ParsePosition p = new ParsePosition(0);
    Date d2 = df.parse(date, p);
    Date d3 = sdf.parse(date);
    Date d4 = sdf.parse(date, p);
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}