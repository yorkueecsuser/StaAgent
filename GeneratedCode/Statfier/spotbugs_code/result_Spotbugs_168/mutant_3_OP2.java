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
    x.setMonth(12); // Mutant: duplicated assignment
    x.setMonth(-1);

    String month = "January";
    month = "January"; // Mutant: duplicated assignment

    System.out.println(month.toUpperCase());
    month = month.toUpperCase();
  }
}