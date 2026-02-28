import java.util.Date;

class Ideas_2010_08_12 {

  Date getDateFromSeconds(int i) {
    return new Date(i);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  Date getDateFromMilliseconds(int i) {
    return new Date(i * 1000);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private boolean getCondition() {
    return false;
  }
}