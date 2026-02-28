import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
    return new Date(i);
  }

  Date getDateFromMilliseconds(int i) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
    return new Date(i * 1000);
  }

  private boolean getCondition() {
    return false;
  }
}