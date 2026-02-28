import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() always returns false
    }
    return new Date(i);
  }

  Date getDateFromMilliseconds(int i) {
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() always returns false
    }
    return new Date(i * 1000);
  }

  private boolean getCondition() {
    return false;
  }
}