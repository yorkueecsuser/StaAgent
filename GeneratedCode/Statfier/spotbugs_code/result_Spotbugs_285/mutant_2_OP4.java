import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in getDateFromSeconds");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in getDateFromSeconds");
    }
    return new Date(i);
  }

  Date getDateFromMilliseconds(int i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in getDateFromMilliseconds");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in getDateFromMilliseconds");
    }
    return new Date(i * 1000);
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else branches unreachable
    return false;
  }
}