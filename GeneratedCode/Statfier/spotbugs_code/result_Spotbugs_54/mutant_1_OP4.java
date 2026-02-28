import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

class Ideas_2009_10_10 {

  void test(SimpleDateFormat sdf, String date) throws Exception {
    DateFormat df = sdf;
    if (date == null) System.out.println("oops");
    
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }

    date = null;
    Date d1 = df.parse(date);
    ParsePosition p = new ParsePosition(0);
    Date d2 = df.parse(date, p);
    Date d3 = sdf.parse(date);
    Date d4 = sdf.parse(date, p);
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}