import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Date(i);
  }

  Date getDateFromMilliseconds(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Date(i * 1000);
  }

  private boolean getCondition() {
    return false;
  }
}