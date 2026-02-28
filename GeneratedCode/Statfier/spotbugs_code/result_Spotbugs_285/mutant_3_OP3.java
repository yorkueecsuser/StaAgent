import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
    return new Date(i);
  }

  Date getDateFromMilliseconds(int i) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable statement.");
    }
    return new Date(i * 1000);
  }

  private boolean getCondition() {
    return false;
  }
}