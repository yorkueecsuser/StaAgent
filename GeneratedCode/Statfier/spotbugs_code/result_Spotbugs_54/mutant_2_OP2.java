import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

class Ideas_2009_10_10 {

  void test(SimpleDateFormat sdf, String date) throws Exception {
    DateFormat df = sdf;
    df = sdf; // Mutant: duplicated assignment statement
    if (date == null) System.out.println("oops");
    date = null;
    date = null; // Mutant: duplicated assignment statement
    Date d1 = df.parse(date);
    ParsePosition p = new ParsePosition(0);
    p = new ParsePosition(0); // Mutant: duplicated assignment statement
    Date d2 = df.parse(date, p);
    Date d3 = sdf.parse(date);
    Date d4 = sdf.parse(date, p);
  }
}