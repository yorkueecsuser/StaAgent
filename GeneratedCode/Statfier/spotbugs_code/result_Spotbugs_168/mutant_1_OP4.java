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

    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() returns false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is an unreachable else block");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}