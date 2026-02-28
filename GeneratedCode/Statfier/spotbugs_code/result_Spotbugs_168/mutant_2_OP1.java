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

    // Dead Store Mutation
    String abcdefgh = "unusedVariable";

    String month = "January";

    System.out.println(month.toUpperCase());
    month = month.toUpperCase();
  }
}