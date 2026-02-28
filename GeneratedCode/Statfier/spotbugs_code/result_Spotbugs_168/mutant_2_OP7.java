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

    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() returns false
      System.out.println("This loop is unreachable");
    }

    String month = "January";

    System.out.println(month.toUpperCase());
    month = month.toUpperCase();
  }

  // Method to return a false condition dynamically
  private static boolean getCondition() {
    return false;
  }
}