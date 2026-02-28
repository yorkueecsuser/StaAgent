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
    x.setMonth(-1); // Mutant: duplicated assignment statement

    String month = "January";
    month = "January"; // Mutant: duplicated assignment statement

    System.out.println(month.toUpperCase());
    month = month.toUpperCase();
  }
}