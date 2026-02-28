import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Date;

class MyMonth extends Date {

  /**
   * @param args
   */
  @ExpectWarning("DMI,DLS")
  public static void main(String[] args) {

    Date x = new Date();
    x.setMonth(12);
    x.setMonth(-1);

    String month = "January";

    System.out.println(month.toUpperCase());
    month = month.toUpperCase();

    // Mutant code
    Date y = new Date();
    y.setMonth(12);
    y.setMonth(-1);

    String z = "February";

    System.out.println(z.toUpperCase());
    z = z.toUpperCase();
  }
}