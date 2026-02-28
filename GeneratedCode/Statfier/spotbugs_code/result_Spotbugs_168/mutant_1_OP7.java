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

    // Introduced an unreachable while loop as per the mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This loop is unreachable");
    }

    String month = "January";

    System.out.println(month.toUpperCase());
    month = month.toUpperCase();
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}