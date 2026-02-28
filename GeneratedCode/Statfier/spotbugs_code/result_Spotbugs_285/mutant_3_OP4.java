import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch.");
    }
    return new Date(i);
  }

  Date getDateFromMilliseconds(int i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is another unreachable else branch.");
    }
    return new Date(i * 1000);
  }

  private boolean getCondition() {
    // This method should return a condition that is dynamically determined at runtime
    // For the purpose of this mutation, it will always return false to make the else branches unreachable
    return false;
  }
}